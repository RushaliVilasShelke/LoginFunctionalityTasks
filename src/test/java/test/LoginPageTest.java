package test;

import org.testng.annotations.Test;

import base.testbase;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginPageTest extends testbase {
	
	@Test
	public void LoginPageTest() {
		
		driver.get(Loginurl);
		LoginPage lp=new LoginPage(driver);
		lp.userName(Username);
		lp.password(Password);
		lp.clickLoginBtn();
	
	if(driver.getTitle().equals("Germany s Calling")) {
		
	 Assert.assertTrue(true);
	}
	else {
		
		Assert.assertFalse(false);
	}
		
	}
	
	

}
