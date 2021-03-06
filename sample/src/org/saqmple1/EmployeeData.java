package org.saqmple1;

public class EmployeeData {

	package org.pageobject;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Date;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MainClass {
	static WebDriver driver;
		@BeforeClass
		public static void browserConfiguration() {
			WebDriverManager.chromedriver().setup();
					
		}
		@Before
		public void browserLaunching() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.greenstechnologys.com/");
	Date d = new Date();
	System.out.println("Browser Lauiching Date:"+d);
		}
		@Test
		public void loginPage() throws InterruptedException {
			
			WebElement complete = driver.findElement(By.xpath("//strong[text()='COMPLETE PRACTICAL TRAINING']"));
		WebElement training = driver.findElement(By.xpath("//h1[@style='font-size:22px;']"));
			JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", complete);
		String text2 = complete.getText();
		System.out.println(text2);
		js.executeScript("arguments[0].scrollIntoView(true)", training);
		WebElement certification = driver.findElement(By.xpath("//a[text()='Certifications']"));
		certification.click();
		WebElement selenium = driver.findElement(By.xpath("(//a[text()='Course Content'])[29]"));
		selenium.click();
		WebElement textimonial = driver.findElement(By.xpath("//a[text()='TESTIMONIALS']"));
		textimonial.click();
		WebElement paragaraph = driver.findElement(By.xpath("(//div[@class='testimonial-section'])[1]"));
		String text = paragaraph.getText();
		System.out.println("   Selenium   ");
		System.out.println(text);
		}
		@Test
		public void courses() throws AWTException {
			WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
			WebElement submenu = driver.findElement(By.xpath("(//ul[@class='sub-menu'])[1]"));
			Actions a = new Actions(driver);
			a.moveToElement(course).perform();
			a.clickAndHold(course).perform();
			a.moveToElement(submenu).perform();
			a.keyDown(Keys.DOWN);
			a.keyUp(Keys.DOWN);
		}
		@After
		public void closingTime() {
			Date d = new Date();
			System.out.println("Browser Closing Date:"+d);
			
		}

	}
	
	public static void main (String args[]) {
	

}
}