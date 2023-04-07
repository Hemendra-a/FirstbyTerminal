package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	public WebDriver driver;
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
	}
   By cartBag=By.cssSelector("[alt='Cart']");
   By checkoutButton=By.xpath("//*[text()='PROCEED TO CHECKOUT']");
   By promoBtn=By.xpath("//*[@id='root']/div/div/div/div/div/button");
   By placeOrder=By.xpath("//*[@id='root']/div/div/div/div/button");
   
   public void CheckoutItems() {
	   driver.findElement(cartBag).click();
	   driver.findElement(checkoutButton).click();
   }
   public Boolean VerifyPromoBtn() {
	return driver.findElement(promoBtn).isDisplayed();
	   
   }
   public Boolean VerifyPlaceOrder() throws InterruptedException {
       Thread.sleep(2000);
	   return driver.findElement(placeOrder).isDisplayed();
   }
    
    
}
