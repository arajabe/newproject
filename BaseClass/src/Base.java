import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
public static WebDriver driver;
public static void browserConfiguration() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VRKRISH\\eclipse-workspace\\BaseClass\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
}
	public static void openurl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	}
	
	public static void sendkeys (String search) {
		WebElement user=driver.findElement(By.id("twotabsearchtextbox"));
		user.sendKeys(search);
		}
	public static void passwordkey(String password) {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		WebElement submitbutton=driver.findElement(By.id("login_submit"));
		submitbutton.click();
	}
	public static void searchbutton() {
		WebElement button=driver.findElement(By.id("nav-search-submit-button"));
		button.click();
	}
	public static void mouseoperation() {
WebElement move=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));		
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();
		a.contextClick().perform();
				}
	public static void keyBoard() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
					}
	public static void screenshot(String title) throws IOException {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File f1= new File("C:\\Users\\VRKRISH\\eclipse-workspace\\BaseClass\\screenghot\\"+title+".png");
		FileUtils.copyFile(f,f1);	
	}


}
