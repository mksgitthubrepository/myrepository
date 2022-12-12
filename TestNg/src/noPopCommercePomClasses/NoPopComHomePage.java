package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComHomePage 

{
	
	@FindBy(xpath="//input[@id='small-searchterms']")private WebElement searchtab;
	@FindBy(xpath="//button[contains(text(),'Search')]")private WebElement searchbutton;
	

	public NoPopComHomePage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	public void search() 
	{
		
		searchtab.sendKeys("macbook");
        searchbutton.click();
	}
	

}
