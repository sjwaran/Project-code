package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\user\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btn.click();
	
//	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
//	firstName.sendKeys("jegatheeshwaran");
//	WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
//	surName.sendKeys("s");
//	WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//	mobile.sendKeys("1234567890");
//	WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//	password.sendKeys("jei");
	Thread.sleep(5000);
	WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(date);
	//s.selectByVisibleText("6");
	List<WebElement> se = s.getOptions();
	for (int i = 0; i <se.size(); i++) {
		WebElement list = se.get(i);
		String text = list.getText();
		System.out.println(text);
	}
	
//	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//	Select s1=new Select(month);
//	s1.selectByValue("8");
//	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//	Select s2=new Select(year);
//	s2.selectByValue("1992");
//	WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
//	gender.click();
//	WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	sign.click();
//	driver.quit();
//	
}
}
