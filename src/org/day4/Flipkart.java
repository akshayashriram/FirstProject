package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement loginBox = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginBox.click();
		
		
	
	
	
	}
}
