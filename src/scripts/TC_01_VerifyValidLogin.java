package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;

public class TC_01_VerifyValidLogin extends InitClass {
	
	@Test
	public void testValidLogin()
	{
		//verify login with valid login
		LoginPage l = new LoginPage(driver);
		l.setUsername("asdf");
		l.setPassword("asdf");
		l.clickLoginButton();
	}
}
