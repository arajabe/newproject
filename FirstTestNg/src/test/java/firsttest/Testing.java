package firsttest;

import java.util.Scanner;

import org.apache.hc.client5.http.impl.auth.SystemDefaultCredentialsProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public WebDriver driver;
	@BeforeClass
private void openbrowser() {
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	@BeforeMethod
	private void tes()
	{
		System.out.println("BeforeMethod");
		
	}
	@Test(retryAnalyzer=Failed.class)
	private void test1()
	{
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		Assert.assertEquals(i,2);
		System.out.println("Test 1");
		
	}
	@Test
	private void test2()
	{
	
		System.out.println("Test 2");
		
	}
	@AfterMethod
	private void close() {
		System.out.println("Hai After Method");
		
		
		}
	@AfterClass
	private void close1() {
		System.out.println("Hai After Class");
		
		
		
	}
	
	

}
