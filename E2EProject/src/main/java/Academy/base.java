package Academy;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
public WebDriver initializaDriver() throws IOException
{
		
 prop = new Properties();
FileInputStream fis = new FileInputStream("D:\\Users\\MIFTIKH\\workspace\\test\\PartData\\src\\main\\java\\resources\\data.properties");

prop.load(fis);
String broswerName=prop.getProperty("broswer");
System.out.println("asdsad");

if(broswerName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//chromedriver.exe");
	driver = new ChromeDriver();
}
else if (broswerName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//geckodriver.exe");
	driver = new FirefoxDriver();
}
else if (broswerName.equals("IE")) 
{
	System.setProperty("webdriver.InternetExplorer.driver", "D:\\Users\\MIFTIKH\\OneDrive - EEOC\\_UPF\\Desktop");
	driver = new InternetExplorerDriver();
}


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\Users\\MIFTIKH\\workspace\\test\\PartData\\Test\\"+result+"Screenshot.png"));
}

}
