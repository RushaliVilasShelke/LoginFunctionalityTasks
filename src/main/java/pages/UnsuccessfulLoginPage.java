package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnsuccessfulLoginPage {
	
	WebDriver ldriver;
	//to initialization webelement
	public UnsuccessfulLoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//webelement repository
	
	@FindBy(name="username")
	WebElement userBoxtxt;
	
	@FindBy(id="password")
	WebElement passwordBoxtxt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	//Action

	public void userNametxt(String uname) {
		
		userBoxtxt.sendKeys(uname);
	}
    public void passwordtxt(String pwd) {
		
    	passwordBoxtxt.sendKeys(pwd);
	}
    public void LoginButton() {
		
    	loginbtn.click();
	}

}
