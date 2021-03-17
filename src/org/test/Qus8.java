package org.test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Qus8 {
public static void main(String[] args) throws InterruptedException {
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
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select s=new Select(location); 
	s.selectByVisibleText("Paris");
	WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select s1=new Select(hotels); 
	s1.selectByVisibleText("Hotel Sunshine");
	WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select s2=new Select(roomType); 
	s2.selectByVisibleText("Double");
	WebElement noRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select s3=new Select(noRoom); 
	s3.selectByVisibleText("5 - Five");
	WebElement checkIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	checkIn.sendKeys("05/06/2021");
	WebElement checkOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	checkOut.sendKeys("07/06/2021");
	WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select s4=new Select(adults); 
	s4.selectByVisibleText("3 - Three");
	WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select s5=new Select(children); 
	s5.selectByVisibleText("2 - Two");
	
	WebElement btn1 = driver.findElement(By.xpath("//input[@name='Submit']"));
	btn1.click();
	
	WebElement btn2 = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	btn2.click();
	
	WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
	cont.click();
	
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
	txtFirstName.sendKeys("Gurusriramesh");
	
	WebElement txtLastName = driver.findElement(By.xpath("//input[@name='last_name']"));
	txtLastName.sendKeys("S");
	
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
	txtAddress.sendKeys("Chennai");
	
	WebElement txtCard = driver.findElement(By.xpath("//input[@name='cc_num']"));
	txtCard.sendKeys("1234567890123456");
	

	WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select s6=new Select(cardType); 
	s6.selectByVisibleText("VISA");
	

	WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select s7=new Select(month); 
	s7.selectByVisibleText("February");
	

	WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select s8=new Select(year); 
	s8.selectByVisibleText("2022");
	
	WebElement txtCvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	txtCvv.sendKeys("456");
	
	WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
	book.click();
	
	Thread.sleep(6000);
	WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
	String text = orderNo.getAttribute("value");
	System.out.println(text);
}
}
