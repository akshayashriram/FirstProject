package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4Q2Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement findPara = driver.findElement(By.xpath("//span[@title='Trainer']"));
		findPara.click();
		
		WebElement findParagraph = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently focuses on')]"));
		String text = findParagraph.getText();
		System.out.println(text);
				
	}
	
	
	

}
