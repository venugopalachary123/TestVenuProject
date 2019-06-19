package HomePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  private WebDriver driver;
  
  @FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
  WebElement sign;
  
  @FindBy(name="userName")
  WebElement username;
  
  @FindBy(name="password")
  WebElement password;
  
  @FindBy(name="login")
  WebElement login;
  
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void sign_click(){
	  sign.click();
  }
   public void user_name(String uname){
	   username.sendKeys(uname);
   }
   public void pass_word(String pswd){
	   password.sendKeys(pswd);
   }
   
 
   }
	
}
