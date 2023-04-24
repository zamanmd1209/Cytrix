package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;

public class FBLoginTest extends TestBase{
	 
	 @Test
	 public void init() throws Exception{
	 
	 //driver.get("https://www.facebook.com");
	 FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
	 loginpage.setEmail("rajkumarsmonline@gmail.com");
	 loginpage.setPassword("raj123456");
	 loginpage.clickOnLoginButton();
	 
	 FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
	 homepage.clickOnProfileDropdown();
	 homepage.verifyLoggedInUserNameText();
	 homepage.clickOnLogoutLink(); 
	 
	 //new line added
	 }
	 
	}
	//Step 4: Creating testng.xml file
	


