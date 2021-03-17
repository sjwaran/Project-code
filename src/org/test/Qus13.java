package org.test;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s=new Select(fruits);
		List l=new ArrayList();
		List l1=new ArrayList();
		List<WebElement> list = s.getOptions();
		for (int i = 0; i <list.size(); i++) {
			WebElement even = list.get(i);
			String text = even.getText();
			l.add(text);
			if(!(i%2==0)) {
				s.selectByVisibleText(text);
		}
		List<WebElement> list2 = s.getAllSelectedOptions();	
		for (WebElement x : list2) {
			String text1 = x.getText();
			l1.add(text1);
		}
}
		l.removeAll(l1);
int size = l.size();
System.out.println(size);
}}