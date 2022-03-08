package com.selenium.test;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class testpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "..//Casestudy3//msedgedriver.exe");  // value is path of the exe file
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:9091/student/sp");
		driver.findElement(By.name("username")).sendKeys("smmadmin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("smmadmin");
		Thread.sleep(3000);
		WebElement Dropdown = driver.findElement(By.name("select"));
		Select typeoption = new Select(Dropdown);
		typeoption.selectByValue("1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		Thread.sleep(2000);
		driver.navigate().to("http://localhost:9091/student/showall");
	}
}
