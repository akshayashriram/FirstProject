package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4TaskQ1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.greenstechnologys.com ");
		
		WebElement txtElement = driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
		String text = txtElement.getText();
		System.out.println(text);		
		
	}

}
