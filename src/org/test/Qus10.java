package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus10 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Gurusriramesh");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("123456789");
		
		WebElement btn = driver.findElement(By.xpath("//input[@name='login']"));
		btn.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		
		Select s= new Select(location);
		List<WebElement> list = s.getOptions();
		for (int i = 0; i <list.size(); i++) {
			WebElement map = list.get(i);
			String text = map.getText();
			System.out.println(text);
		}
		
	}
}
