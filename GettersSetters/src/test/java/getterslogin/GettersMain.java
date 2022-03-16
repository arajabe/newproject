package getterslogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettersMain {
public static WebDriver driver;
	public static void main(String aargs[]) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
GettersLoginPage p = new GettersLoginPage();
p.getUsername().sendKeys("raja");

	}
}
