package TestHomepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePageUtils.ConstantsUtils;
import HomePages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty(ConstantsUtils.browsedriver, ConstantsUtils.chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ConstantsUtils.url);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
	}
	
	@Test
	public void adminlogin(){
		LoginPage lgn = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lgn.sign_click();
		lgn.user_name("qedge");
		lgn.pass_word("qedge");
		lgn.log_in();
		
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
	
}
