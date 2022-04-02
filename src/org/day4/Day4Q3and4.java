package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q3and4 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
	
		WebElement addressAdyar = driver.findElement(By.xpath("(//ul[@class='address'])[1]"));
		String text = addressAdyar.getText();
		
				
		WebElement addressOMR = driver.findElement(By.xpath("(//ul[@class='address'])[2]"));
		String text1 = addressOMR.getText();
		
		
		WebElement clickButton = driver.findElement(By.xpath("//span[@title='Overview']"));
		clickButton.click();
		Thread.sleep(3000);
		
		
		WebElement findParagraph = driver.findElement(By.xpath("//p[contains(text(),'make you an expert in Selenium')]"));
		String text2 = findParagraph.getText();
		System.out.println(text2);
		System.out.println("\n" + "OMR Address:" + "\n" + text1);
		System.out.println("Adyar Address:" + "\n" + text);
}	

}
