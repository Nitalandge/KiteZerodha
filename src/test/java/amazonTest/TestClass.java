package amazonTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonP.HomePage;
import amazonP.Login2Page;
import amazonP.LoginPage;

public class TestClass extends AmBaseClass {
HomePage p3;
Login2Page p2;
LoginPage p1;
 
@BeforeClass
public void openbrowser() {
	openBrowser();
	p1=new LoginPage(driver);
	p2=new Login2Page(driver);
	p3=new HomePage(driver);
	
}
@BeforeMethod
public void loginapp() throws Throwable {
	p1.enterUN(AmUtilityClass.getSheet(0, 0));
	p1.clickctnbtn();
	p2.enterPWD(AmUtilityClass.getSheet(0, 1));
	p2.clicksign();
	
}
@Test
public void verifyname() throws Throwable {
	Reporter.log("i am verfying name", true);
	String actName=p3.verifyName();
	String expName=AmUtilityClass.getSheet(0, 2);
	Assert.assertEquals(actName, expName,"both not matching so tc fail");
}
@AfterMethod
public void closeApp() {
	Reporter.log("i closed the app", true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("i am closing browser", true);
}
}
