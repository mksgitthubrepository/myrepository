package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComLoginPage 
{
	
	
		
	
	
	@FindBy(xpath="//input[@id='Email']")private WebElement Gmail;
	
	@FindBy(xpath="//input[@id='Password']")private WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")private WebElement LogInButton;
	
	
	
	public NoPopComLoginPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this );
		
	}
	
	
	public void entermail(WebDriver driver,String mail) 
	{
		Gmail.sendKeys(mail);
		
	
	}

	public void enterpass(WebDriver driver,String pass) 
	{
		Password.sendKeys(pass);
		
	}
	public void login() 
	{
		LogInButton.click();
	}
}
