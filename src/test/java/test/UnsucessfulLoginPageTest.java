package test;

import org.testng.annotations.Test;

import base.testbase;
import junit.framework.Assert;
import pages.UnsuccessfulLoginPage;

public class UnsucessfulLoginPageTest extends testbase {
	
	@Test
	public void UnsucessfulLoginPageTest() {
		
		driver.get(Loginurl);
		UnsuccessfulLoginPage unlp=new UnsuccessfulLoginPage(driver);
		unlp.userNametxt(invalidUsername);
		unlp.passwordtxt(Password);
		unlp.LoginButton();
	
	if(driver.getTitle().equals("Germany s Calling")) {
		
	 Assert.assertTrue(true);
	}
	else {
		
		Assert.assertFalse(false);
	}
		
	}
	

}
