package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.Title;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize () throws IOException {
		driver=initializaDriver();
		log.info("driver is initialized  " + driver.getTitle());
		
		
		
		driver.get(prop.getProperty("URL"));
		log.info("URL open scuessfully ");
		
		
	}
	
	
	@Test(priority=1)
	
	public void loginPage() throws IOException, InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(prop.getProperty("Username"));
		l.getPassword().sendKeys(prop.getProperty("Password"));
		l.getLoginButton().click();
		Title lp = new Title(driver);
		lp.getCont().click();
		log.info("this a title " + lp.getTitle().getText());
		
		
		log.info("loging is sucuessfil");
		
		
		
		
	}
	@Test(priority=2)
	public void md715MenuTab()
	{
		driver.findElement(By.xpath("//a[@href='#']//span[contains(text(),'MD-715')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PART Data')]")).click();
		Reporter.log("2 test");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
//	@DataProvider
//	public Object[][] getData()
//	{
//		Object[][] data = new Object[1][2];
//		data[0][0]="fedseptest@yahoo.com";
//		data[0][1]="ML0000";
//		
//		return data;
//	}
//	
}
