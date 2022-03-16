import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

public class Amazon {

	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VRKRISH\\eclipse-workspace\\24Amazon\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		//search.sendKeys("washing");
		a.keyDown(Keys.SHIFT).sendKeys(search,"washing").build().perform();
		a.keyUp(Keys.SHIFT).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
		
	}
	 
	

}
