import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VRKRISH\\eclipse-workspace\\23Google\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("btnI"));
		search.click();
	
			
		
	}

}
