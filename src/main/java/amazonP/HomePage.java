package amazonP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[text()='New Releases']")private WebElement Name;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public String verifyName() {
	String actName=Name.getText();
	return actName;
}
}
