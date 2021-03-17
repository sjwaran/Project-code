package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\user\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i <list.size() ; i++) {
			WebElement name = list.get(i);
			String text = name.getAttribute("value");
			System.out.println(text);
		}
	}
}
