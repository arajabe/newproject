package org.testng;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClass {
public WebDriver driver;
	@BeforeClass
	private void beforeClass() {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://hyperionit.com:2096");
	}
	@Test(dataProvider="userId")
		private void userId(String userId,String Useri) throws InterruptedException {
		WebElement userid=driver.findElement(By.xpath("//input[@id='user']"));
		userid.sendKeys(userId);
		Thread.sleep(5000);
	}
	@Test(dataProvider="passWord")
		private void passWord(String passWord,String passWord1) throws InterruptedException {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(passWord);
		Thread.sleep(5000);
		
	}
	@AfterClass
	private void browserClose() {
		driver.close();
		}
@DataProvider(name="userId")
private Object[][] dataUserId() {
		return new Object[][] {
			{"arajabe77","king"}
		};
}		
@DataProvider(name="passWord")		
private Object[][] dataPassWord (){
	return new Object[][] {
		
		{"12345","2356"}
	};
	

}	




}
