package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LoginPage;
import pageObject.Title;


public class landingPage2 extends base {

	@BeforeTest
	public void initialize () throws IOException {
		driver=initializaDriver();
		driver.get(prop.getProperty("URL"));
	}
	
	
	@Test()
	
	public void VerifyTheLoginPage() throws IOException, InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(prop.getProperty("Username"));
		l.getPassword().sendKeys(prop.getProperty("Password"));
		l.getLoginButton().click();
		Title lp = new Title(driver);
		lp.getCont().click();
		Assert.assertEquals(lp.getTitle().getText(), "WELCOME");
		boolean aqii=driver.findElement(By.xpath("asdsa")).isDisplayed();		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
	

}
