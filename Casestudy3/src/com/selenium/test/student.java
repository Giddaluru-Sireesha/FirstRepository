package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class student {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.edge.driver", "..//Casestudy3//msedgedriver.exe");  // value is path of the exe file
	WebDriver driver = new EdgeDriver();
	driver.get("http://localhost:9091/student/addNewS");
	driver.findElement(By.name("rollno")).sendKeys("104");
	Thread.sleep(3000);
	driver.findElement(By.name("stdName")).sendKeys("Bones");
	Thread.sleep(3000);
	driver.findElement(By.name("gender")).sendKeys("f");
	Thread.sleep(3000);
	driver.findElement(By.name("address")).sendKeys("balajinagar");
	Thread.sleep(3000);
	driver.findElement(By.name("location")).sendKeys("Tirupati");
	Thread.sleep(3000);
	driver.findElement(By.name("phone")).sendKeys("7675993096");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("bones@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("64321");
	Thread.sleep(3000);
	driver.findElement(By.name("classId")).sendKeys("2");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[type='submit']")).submit();
	}
}
