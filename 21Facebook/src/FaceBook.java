import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\VRKRISH\\eclipse-workspace\\21Facebook\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement input= driver.findElement(By.id("email"));
	input.sendKeys("arajabe@gmail.com");
	WebElement password =driver.findElement(By.name("pass"));
	password.sendKeys("nannilam");
	driver.findElement(By.xpath("//button[@value='1']")).click();
}
}
