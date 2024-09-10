package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver ldriver;
	//to initialization webelement
	public SignUpPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//webelement repository
	
	@FindBy(name="first_name")
	WebElement Name;
	
	@FindBy(id="username")
	WebElement usertxtBox;
	
	@FindBy(id="password")
	WebElement passwordtxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignUp;
	
	//Action
	public void setName(String uname) {
	
		Name.sendKeys(uname);
	}

	public void setuserName(String uname) {
		
		usertxtBox.sendKeys(uname);
	}
    public void setpassword(String pwd) {
		
    	passwordtxtBox.sendKeys(pwd);
	}
    public void clickSingUp() {
		
    	SignUp.click();
	}
	
}
