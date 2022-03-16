import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VRKRISH\\eclipse-workspace\\62Alert\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement box= driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		box.click();
		Alert a = driver.switchTo().alert();
	
	}

}
