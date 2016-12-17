package scripts;

import org.testng.annotations.Test;

import generics.ExcelDataRead;
import pom.LoginPage;

public class TC_02_VerifyInvalidLogin extends InitClass {

	@Test(alwaysRun=true)
	public void testInvalidLogin()
	{
		String sheet = "InvalidLoginDetails";
		int rc=ExcelDataRead.getRowCount(FILEPATH, sheet, 0);
		for(int i=1; i<rc; i++)
		{
			String un = ExcelDataRead.getCellValue(FILEPATH, sheet, i, 0);
			String pw = ExcelDataRead.getCellValue(FILEPATH, sheet, i, 1);
			LoginPage l = new LoginPage(driver);
			l.setUsername(un);
			l.setPassword(pw);
			l.clickLoginButton();
			l.verifyErrorMessage();
		}		
	}
}
