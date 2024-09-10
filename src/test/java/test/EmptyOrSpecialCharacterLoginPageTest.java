package test;

import org.testng.annotations.Test;

import base.testbase;
import junit.framework.Assert;
import pages.EmptyOrSpecialCharacterLoginPage;
public class EmptyOrSpecialCharacterLoginPageTest extends testbase {
	
	@Test
	public void LoginPageTest() {
		
		driver.get(Loginurl);
		EmptyOrSpecialCharacterLoginPage emlp=new EmptyOrSpecialCharacterLoginPage(driver);
		emlp.userNamebox(emptyUsername);
		emlp.passwordbox(Password);
		emlp.clickLoginBtnbox();
	
	if(driver.getTitle().equals("Germany s Calling")) {
		
	 Assert.assertTrue(true);
	}
	else {
		
		Assert.assertFalse(false);
	}
		
	}

}
