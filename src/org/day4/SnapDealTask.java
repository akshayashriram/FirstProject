package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTask {

		public static void main(String[] args) throws AWTException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver ();
			
			driver.get("https://www.snapdeal.com/");
		
			Actions a = new Actions (driver);
			
			WebElement searchBox = driver.findElement(By.id("inputValEnter"));
			a.click(searchBox).perform();
			
			searchBox.sendKeys("one plus");
			
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement clickProduct = driver.findElement(By.xpath("(//p[@class='product-title'])[3]"));
			a.click(clickProduct).perform();
			
			
			
			
		}

}
