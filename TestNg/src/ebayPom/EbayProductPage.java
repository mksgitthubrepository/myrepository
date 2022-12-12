package ebayPom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import ebayUtility.EbayUtility;

public class EbayProductPage 
{
	
	
	
	@FindBy(xpath = "(//div[@class='s-item__detail s-item__detail--primary']//span)[36]")private WebElement price;
	
	
	public EbayProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void phone(WebDriver driver) throws InterruptedException, IOException 
	{
		EbayUtility.scroll(driver,driver.findElement(By.xpath("(//div[@class='s-item__title'])[5]")));
		Thread.sleep(2000);
		EbayUtility.takescreenshort(driver," product");
		Thread.sleep(2000);
		EbayUtility.scroll(driver, driver.findElement(By.id("gh-ug")));
		Reporter.log("product price is  "+price.getText(),true);
		
	}

	
	
}
