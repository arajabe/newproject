import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class BrowserLaunch {

public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VRKRISH\\eclipse-workspace\\Facebook\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("Titel"+driver.getTitle());
	System.out.println("Current Urul"+driver.getCurrentUrl());
	driver.findElement(By.id("email"));
	
	
}
	

}
