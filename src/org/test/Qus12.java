package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruits);
		boolean b = s.isMultiple();
		System.out.println(b);

		Thread.sleep(6000);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i < list.size(); i++) {
			
			WebElement name = list.get(i);
			String text = name.getText();
			
			if (text.equals("Grape")||text.equals("Apple")||text.equals("Orange")) {
				s.selectByVisibleText(text);
				
			}
}
		WebElement option = s.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);

		
	}
}