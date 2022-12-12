package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserdetaiIls 
{
    @FindBy(name="userId")private WebElement UID;
	
	@FindBy(name="password")private WebElement pass;
	
	@FindBy(xpath="//button[@id='submit-btn']")private WebElement signin;
	
	
	
	public UserdetaiIls(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	
	
	public void userid()
	{
		UID.sendKeys("BF0980");
	}
	public void password() 
	{
		pass.sendKeys("Rajput@16498");
	}
	public void signin() 
	{
		signin.click();;
	}
	
	public static void test() 
	{
		System.out.println("static method from pom class");
	} 
	
	
}
