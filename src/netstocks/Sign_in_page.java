package netstocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page 
{
	
	@FindBy(name="ctl00$MainContent$signinsignup$txt_mobilenumber") private WebElement id;
	@FindBy(id ="lnk_signup1") private WebElement signin;
	
	
	public Sign_in_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterid(String num) 
	{
		id.sendKeys(num);
		signin.click();
	}
	

}
