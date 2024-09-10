package test;

import org.testng.annotations.Test;

import base.testbase;
import pages.SignUpPage;

public class SignUpPageTest extends testbase {
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		SignUpPage sp=new SignUpPage(driver);
		sp.setName(Name);
		sp.setuserName(Username);
		sp.setpassword(Password);
		sp.clickSingUp();
	}
	

}
