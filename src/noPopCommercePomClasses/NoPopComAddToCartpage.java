package noPopCommercePomClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noPopComUtility.NoPopComUtilityClass;

public class NoPopComAddToCartpage 
{
	
@FindBy(xpath="//button[@id='add-to-cart-button-4']")private WebElement AddtoCart2;
@FindBy(xpath = "//span[contains(text(),'Shopping cart')]") private WebElement cart;
	
	
	
	public NoPopComAddToCartpage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	public void addtocart2(WebDriver driver) throws IOException 
	{
		
		NoPopComUtilityClass.scroll(driver, driver.findElement(By.xpath("//div[@class='page product-details-page']")));
		NoPopComUtilityClass.takescreenshort(driver, "product");
		
		AddtoCart2.click();
		cart.click();
		
		
	}
	
	
	

}
