package com.selenium.test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class student {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		String rollno=sc.next();
		System.out.println("Enter Student Name");
		String stdn=sc.next();
		System.out.println("Enter Gender");
		String gender=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter Location");
		String lctn=sc.next();
		System.out.println("Enter Phone Number");
		String phone=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter password");
		String pswd=sc.next();
		System.out.println("Enter ClassID");
		String clsid=sc.next();
	System.setProperty("webdriver.edge.driver", "..//Casestudt4//msedgedriver.exe");  // value is path of the exe file
	WebDriver driver = new EdgeDriver();
	driver.get("http://localhost:9091/student/addNewS");
	WebElement rolln=driver.findElement(By.name("rollno"));
	rolln.sendKeys(rollno);
	Thread.sleep(1000);
	WebElement std=driver.findElement(By.name("stdName"));
	std.sendKeys(stdn);
	Thread.sleep(1000);
	WebElement gen=driver.findElement(By.name("gender"));
	gen.sendKeys(gender);
	Thread.sleep(1000);
	WebElement add=driver.findElement(By.name("address"));
	add.sendKeys(address);
	Thread.sleep(1000);
	WebElement loc=driver.findElement(By.name("location"));
	loc.sendKeys(lctn);
	Thread.sleep(1000);
	WebElement phn=driver.findElement(By.name("phone"));
	phn.sendKeys(phone);
	Thread.sleep(1000);
	WebElement emi=driver.findElement(By.name("email"));
	emi.sendKeys(email);
	Thread.sleep(1000);
	WebElement psw=driver.findElement(By.name("password"));
	psw.sendKeys(pswd);
	Thread.sleep(1000);
	WebElement cls=driver.findElement(By.name("classId"));
	cls.sendKeys(clsid);
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[type='submit']")).submit();
	}
}
