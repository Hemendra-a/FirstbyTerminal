package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
//it is responsible to give the object
	//page factory design pattern
	public LandingPage LandingPage ;
	public OfferPage OfferPage;
    public WebDriver driver;
    public Checkoutpage checkoutPage;
	public PageObjectManager (WebDriver driver) {
		this.driver=driver;
	}
	public LandingPage getLandingPage () {
		LandingPage =new LandingPage (driver);
		return LandingPage;
	}
	public OfferPage OfferPage() {
		OfferPage =new OfferPage(driver);
		return OfferPage;
	}
	public Checkoutpage getcheckoutPage() {
		checkoutPage=new Checkoutpage(driver);
		return checkoutPage;
	}
}
