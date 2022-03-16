import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {

	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\VRKRISH\\eclipse-workspace\\File\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hyperionit.com:2096/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("user"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','RAJA')",user);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		File f1 = new File ("C:\\Users\\VRKRISH\\eclipse-workspace\\File\\screenshot\\facebook.png");
		FileUtils.copyFile(f,f1);
		driver.close();
	}  

}
