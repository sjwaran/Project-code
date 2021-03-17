package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btn.click();
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(year);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i <list.size() ; i++) {
			WebElement year1 = list.get(i);
			String text = year1.getText();
			System.out.println(text);
		}
	}
}
