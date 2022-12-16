package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComPaymentInfoPage 
{
	
	
	@FindBy(xpath = "//select[@id='CreditCardType']")private WebElement selectcard;
	
	@FindBy(xpath = "//option[contains(text(),'Master card')]")private WebElement selectmastercard;
	
	@FindBy(xpath = "//input[@id='CardholderName']")private WebElement cardhname;
	
	@FindBy(xpath = "//input[@id='CardNumber']")private WebElement cardnumber;
	
	@FindBy(xpath = "//select[@id='ExpireYear']")private WebElement ExyearDD;
	
	@FindBy(xpath = "//option[contains(text(),'2024')]")private WebElement Exyearselect;
	
	@FindBy(xpath = " //input[@id='CardCode']")private WebElement cardcode;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")private WebElement continueb;
	
	
	
	public NoPopComPaymentInfoPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void cardinfoenter(String name,String cnumber ,String cardcode1) 
	{
		selectcard.click();
		selectmastercard.click();
		cardhname.sendKeys(name);
		cardnumber.sendKeys(cnumber);
		ExyearDD.click();
		Exyearselect.click();
		cardcode.sendKeys(cardcode1);
		continueb.click();
		
	}
	
	
	
	
	

	

}
