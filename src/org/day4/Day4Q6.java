package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4Q6 {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver ();
			driver.get("https://www.facebook.com/");
			
			WebElement txtUsername = driver.findElement(By.id("email"));
			txtUsername.sendKeys("akshayasuresh6@gmail.com");
			
			
			WebElement txtemail1 = driver.findElement(By.name("email"));
			String attribute = txtemail1.getAttribute("value");
			System.out.println("Username: " + attribute);
			
			WebElement txtPass = driver.findElement(By.id("pass"));
			txtPass.sendKeys("111111");
			
			WebElement txtpass1 = driver.findElement(By.name("pass"));
			String attribute2 = txtpass1.getAttribute("class");
			System.out.println("Class name: " + attribute2);
			
			
			
		}

}
