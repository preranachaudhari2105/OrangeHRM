package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginTest extends BaseTest {

	@Test(priority = 2,groups={"smoke","regression"})
	public void verifyLogin() {
		loginPage.loginMethod();
		Assert.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}

	@Test(priority = 1)
	public void verifyLoginPageIsDisplayed() {
		Assert.assertEquals(loginPage.titleLoginPage(), "Login");
	}
	
	@Test(priority = 0,groups="smoke")
	public void verifyUrlOfPage() {
		Assert.assertEquals(loginPage.currentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
