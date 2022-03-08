package com.selenium.test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class emp {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String empn=sc.nextLine();
		System.out.println("Enter job");
		String jb=sc.next();
		System.out.println("Enter salary");
		String sal=sc.next();
		System.out.println("Enter email");
		String em=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		System.setProperty("webdriver.edge.driver", "..//Casestudt4//msedgedriver.exe");  // value is path of the exe file
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:9004/myjdbcapp/addemp");
		WebElement empname=driver.findElement(By.name("txtEname"));
		empname.sendKeys(empn);
		Thread.sleep(1000);
		WebElement job=driver.findElement(By.name("txtJob"));
		job.sendKeys(jb);
		Thread.sleep(1000);
		WebElement salary=driver.findElement(By.name("txtSal"));
		salary.sendKeys(sal);
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.name("txtEmail"));
		email.sendKeys(em);
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.name("txtPass"));
		password.sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		Thread.sleep(1000);
		driver.navigate().to("http://localhost:9004/myjdbcapp/showall");
	}

}
