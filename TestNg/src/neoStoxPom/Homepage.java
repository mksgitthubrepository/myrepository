package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{

	
	 @FindBy(xpath ="(//span[@class='righttopmenu1'])//span[@id='lbl_username']") private WebElement user;
	 @FindBy(id ="lnk_logout") private WebElement lg;
	 @FindBy(xpath = "(//span[@class='righttopmenu1']//span)[3]")private WebElement funds;
		
		
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		
		public String test(WebDriver driver) 
		{
			System.out.println(user.getText());
		   String username = user.getText();
			
			return username;
		}
		public void logout() 
		{
			
			user.click();
			lg.click();
		}
		public String availablefunds(WebDriver driver) 
		{
			System.out.println("available funds are "+funds.getText());
			String fund=funds.getText();
			return fund;
			
			
		}
}
