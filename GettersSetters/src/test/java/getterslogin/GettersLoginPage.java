package getterslogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GettersLoginPage extends GettersMain {

	public  GettersLoginPage() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(id="email")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}

}
