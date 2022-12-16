package noPopCommercePomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComProductPage 
{
	
	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")private WebElement AddtoCart;
	
	
	
	public NoPopComProductPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	public void addtocart(WebDriver driver) throws InterruptedException, IOException 
	{
		
		
		
		AddtoCart.click();
		
	}

}
