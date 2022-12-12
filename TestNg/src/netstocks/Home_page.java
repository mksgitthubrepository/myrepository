package netstocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	
	
	
	 @FindBy(xpath ="(//span[@class='righttopmenu1'])//span[@id='lbl_username']") private WebElement user;
	 @FindBy(id ="lnk_logout") private WebElement lg;
		
		
		public Home_page(WebDriver driver)
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
}
