package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VRKRISH\\eclipse-workspace\\11Browerser\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
	}

}
