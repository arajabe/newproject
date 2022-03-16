import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\VRKRISH\\eclipse-workspace\\13selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		
		
	}

}
