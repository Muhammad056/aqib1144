package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Title {

	
	public WebDriver driver;
	By cont = By.xpath("//span[@class='ui-button-text ui-c']");
	By title= By.xpath("//h1[contains(text(),'Welcome')]");
	By date = By.xpath("//span[@id='dateForm:j_idt83']");
	
	
	public Title(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getCont(){
		return driver.findElement(cont);
	}
	
	public WebElement getTitle(){
		return driver.findElement(title);
	}
	public WebElement getDate(){
		return driver.findElement(date);
	}
	
	
	
}
