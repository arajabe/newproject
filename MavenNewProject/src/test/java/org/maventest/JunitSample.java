package org.maventest;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageobjectmodel.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;




public class JunitSample extends LoginPage{
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchingBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
System.out.println("before class");
	}
	@Before
	public void login() {
		pageObject a =new pageObject();
		a.getUsername().sendKeys("r");
		System.out.println("before");
	}
	@Test
	public void test1() {
			System.out.println("first test");

	}
	
	@After
	public void pub1() {
	
		System.out.println("Test Completed");	
	}
	@AfterClass
	public static void browserClose() {
		

	}

}
