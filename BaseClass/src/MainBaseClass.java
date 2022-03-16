import java.awt.AWTException;
import java.io.IOException;

public class MainBaseClass extends Base{

	public static void main(String args[]) throws AWTException, IOException {
	browserConfiguration();
	openurl("https://www.amazon.com/");
	screenshot("open url");
	sendkeys("washing");
	screenshot("sendkey");
	searchbutton();
	mouseoperation();
	keyBoard();
	screenshot("washing");
	openurl("https://www.gmail.com/");
	screenshot("raja");
	driver.quit();

}
}