package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement aqib = driver.findElement(By.xpath("//select[@id='month']"));
		Select number = new Select(aqib);
		number.selectByVisibleText("Jan");
//		number.selectByIndex(1);
		WebElement aqib1 = driver.findElement(By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']"));
		Assert.assertEquals(aqib1.getText(), "Sign Up");
		System.out.println(aqib1.getText());
		System.out.println("passs");
		WebElement aqib12 = driver.findElement(By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']"));
		Assert.assertTrue(aqib12.isDisplayed());
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Messenger")).click();
		
		
		driver.navigate().back();
		
		
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("scroll down");
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
