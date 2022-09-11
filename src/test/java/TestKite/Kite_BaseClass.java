package TestKite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kite_BaseClass {
	public WebDriver driver;

public void initialiseBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\bhand\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}
}
