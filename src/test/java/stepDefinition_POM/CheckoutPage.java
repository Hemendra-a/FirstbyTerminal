package stepDefinition_POM;



import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Checkoutpage;
import utils.Testcontextsetup;

public class CheckoutPage {
	public String offerPageproname;
	Testcontextsetup Testcontextsetup;
	public Checkoutpage checkoutPage;
	public CheckoutPage (Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.checkoutPage=Testcontextsetup.PageObjectManager.getcheckoutPage();
	}

    @Then("^user proceeds to Checkout and validate the (.+) items in Checkout page$")
    public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
  	    Thread.sleep(2000);
    	checkoutPage.CheckoutItems();
    	
    }
    @And("verify user has ability to enter promo code and place the order")
    public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
    	
    	Assert.assertTrue(checkoutPage.VerifyPromoBtn());
    	Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
    }
}
