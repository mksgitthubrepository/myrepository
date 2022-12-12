package noPopCommerceTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import noPopComUtility.NoPopComUtilityClass;
import noPopCommerceBase.NoPopComBase;
import noPopCommercePomClasses.NoPopComAddToCartpage;
import noPopCommercePomClasses.NoPopComCartPage;
import noPopCommercePomClasses.NoPopComConfirmOrderPage;
import noPopCommercePomClasses.NoPopComHomePage;
import noPopCommercePomClasses.NoPopComLoginPage;
import noPopCommercePomClasses.NoPopComOrderConfirmPage;
import noPopCommercePomClasses.NoPopComOrderInfoPage;
import noPopCommercePomClasses.NoPopComPaymentInfoPage;
import noPopCommercePomClasses.NoPopComPaymentMethPage;
import noPopCommercePomClasses.NoPopComProductPage;
import noPopCommercePomClasses.NoPopComShippingMethodPage;

import noPopCommercePomClasses.NoPopComSelectaddressPage;

@Listeners(noPopComListeners.NoPopComListeners.class)
public class NoPopCommerceTest extends NoPopComBase 
{
	NoPopComLoginPage login;
	NoPopComHomePage home;
	NoPopComProductPage product;
	NoPopComAddToCartpage addtocart;
	NoPopComCartPage cart;
	NoPopComSelectaddressPage address;
	NoPopComShippingMethodPage shipping;
	NoPopComPaymentMethPage cardtype;
	NoPopComPaymentInfoPage paymentinfo;
	NoPopComConfirmOrderPage confirm;
	NoPopComOrderConfirmPage details;
	NoPopComOrderInfoPage info;

	@BeforeClass
	public void browserlaunch() throws IOException 
	{
		launchbrowser();

		login = new NoPopComLoginPage(driver);
		home = new NoPopComHomePage(driver);
		product = new NoPopComProductPage(driver);
		addtocart = new NoPopComAddToCartpage(driver);
		cart = new NoPopComCartPage(driver);
		address = new NoPopComSelectaddressPage(driver);
		shipping = new NoPopComShippingMethodPage(driver);
		cardtype = new NoPopComPaymentMethPage(driver);
		paymentinfo = new NoPopComPaymentInfoPage(driver);
		confirm = new NoPopComConfirmOrderPage(driver);
		details = new NoPopComOrderConfirmPage(driver);
		info = new NoPopComOrderInfoPage(driver);

	}

	@BeforeMethod
	public void productpurchase() throws IOException, InterruptedException 
	{

		login.entermail(driver, NoPopComUtilityClass.getdatafrompropfile("Gmail"));
		login.enterpass(driver, NoPopComUtilityClass.getdatafrompropfile("password"));
		login.login();

		home.search();

		product.addtocart(driver);

		addtocart.addtocart2(driver);

		cart.Checkout();
		address.addressselcet();

		shipping.shipping();

		cardtype.cardtypeselect(driver);

		paymentinfo.cardinfoenter(NoPopComUtilityClass.getdatafrompropfile("cardholdername"),NoPopComUtilityClass.getdatafrompropfile("cardnumber"),NoPopComUtilityClass.getdatafrompropfile("cardcode"));

		confirm.confirmorder();

		details.orderdetails();

	}

	@Test
	public void orderinfo() 
	{

		info.orderinfo();

	}

	@AfterMethod
	public void logout() 
	{

		info.logout();
	}

	@AfterClass
	public void closebrowser() 
	{

		driver.close();
	}

}
