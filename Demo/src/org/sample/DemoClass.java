package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VRKRISH\\eclipse-workspace\\Demo\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/");
	
	}

}
