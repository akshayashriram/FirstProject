package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions (driver);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	
		a.moveToElement(searchBox).perform();
		a.click(searchBox).perform();
		
		searchBox.sendKeys("Greens Velmuguran");
		
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement searchedText = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		a.click(searchedText).perform();
		
		
		
		
		
		
	}

}
