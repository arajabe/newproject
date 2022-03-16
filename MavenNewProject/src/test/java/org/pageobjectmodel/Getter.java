package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter {
	public static WebDriver driver;
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		PageObject p = new PageObject();
		p.getUsername().sendKeys("raja");
		
		
	}

}
