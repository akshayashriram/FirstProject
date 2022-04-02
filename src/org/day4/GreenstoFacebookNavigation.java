package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstoFacebookNavigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVOBOOK\\eclipse-workspace\\SeleniumDay4Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		// To launch greens webpage
		driver.get("http://www.greenstechnologys.com/");
		
		//to print the title of the webpage in console
		String title = driver.getTitle();
		System.out.println(title);
		
		//to find the text using partial text method
		WebElement findText = driver.findElement(By.xpath("//p[contains(text(),'real corporate exposure')]"));
		String text = findText.getText();
		System.out.println(text);
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(text);	
		
	}
}