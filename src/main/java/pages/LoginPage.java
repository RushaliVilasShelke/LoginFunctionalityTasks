package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	//to initialization webelement
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//webelement repository
	
	@FindBy(name="username")
	WebElement userBox;
	
	@FindBy(id="password")
	WebElement passwordBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	//Action

	public void userName(String uname) {
		
		userBox.sendKeys(uname);
	}
    public void password(String pwd) {
		
    	passwordBox.sendKeys(pwd);
	}
    public void clickLoginBtn() {
		
    	loginbtn.click();
	}
	
	
}
