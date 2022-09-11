package amazonP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {
@FindBy(xpath="//input[@id='ap_password']")private WebElement pwd;
@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signbtn;

public Login2Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterPWD(String Password) {
	pwd.sendKeys(Password);
}
public void clicksign() {
	signbtn.click();
}
}
