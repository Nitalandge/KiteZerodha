package TestKite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom_Classes.KitePom1;
import Pom_Classes.KitePom2;
import Pom_Classes.KitePom3;

public class Kite_Test_Class extends Kite_BaseClass{
KitePom1 login1;
KitePom2 login2;
KitePom3 home;
@BeforeClass
public void openBrowser() {
	initialiseBrowser();
	login1=new KitePom1(driver);
	login2=new KitePom2(driver);
	home=new KitePom3(driver);
}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		login1.enterUN(Kite_Utility_Class.getTD(0, 0));
		login1.enterPWD(Kite_Utility_Class.getTD(0, 1));
		login1.clickLOGINBTN();
		
		// login2 page
		login2.enterPIN(Kite_Utility_Class.getTD(0, 2));
		login2.clickcntBtn();
		
	}
	@Test
	public void verifyUserID() throws Throwable {
		Reporter.log("running verify UserID", true);
		String actID= home.verifyuserID();
		String expID=Kite_Utility_Class.getTD(0, 0);
		Assert.assertEquals(actID,expID,"both are diffrent so tc failed");
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("logout the app", true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("browser closed", true);
	}

}