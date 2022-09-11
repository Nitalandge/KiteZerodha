package amazonP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath = "//input[@id='ap_email']")private WebElement un;
@FindBy(xpath = "//input[@id='continue']")private WebElement ctnbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUN(String Username) {
	un.sendKeys(Username);
	
}
public void clickctnbtn() {
	ctnbtn.click();
}
}
