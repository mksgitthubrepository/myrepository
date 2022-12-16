package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detailspage 
{
	
	@FindBy(xpath="(//i[@class='radio'])[2]")private WebElement gender;
	@FindBy(id="nameAdd") private WebElement name;
	@FindBy(name="dob")private WebElement dob;
	@FindBy(id="mobileNo")private  WebElement mobno;
	@FindBy(id="submitButton") private WebElement button;
	
	public Detailspage(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void Details(String key,String date,String no,String Gender) throws InterruptedException 
	{
		gender.click();
		name.sendKeys(key);
		dob.sendKeys(date);
		mobno.sendKeys(no);
		
		
   }
	public void buttonclick() 
	{
		button.click();
	}
	
	

}
