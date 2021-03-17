package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus11 {
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
		
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		
		Select s= new Select(adult);
		List<WebElement> list = s.getOptions();
		int j = list.size();
		j=j-1;
		System.out.println(j);		
	}
}
