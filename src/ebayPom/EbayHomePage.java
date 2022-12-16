package ebayPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EbayHomePage 
{
	
	
	
	@FindBy(id="gh-ug")private WebElement name;
	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")private WebElement tab;
	@FindBy(id="gh-btn")private WebElement search; 
	@FindBy(linkText = "Sign out")private WebElement signout;
	
	
	public EbayHomePage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver,this);
	}

	public String name(WebDriver driver) 
	{
		
		System.out.println(name.getText());
		String actualname = name.getText();
		return actualname;
		
	}
	public void search(WebDriver driver ,String data) 
	{
		tab.sendKeys(data);
	}
	public void searchbutton() 
	{
		search.click();
	}
	public void logout() throws InterruptedException 
	{
		name.click();
		Reporter.log("clicking on name", true);
		Thread.sleep(2000);
		Reporter.log("clicking on signout", true);
		signout.click();
		
	}
	
	
	
}
