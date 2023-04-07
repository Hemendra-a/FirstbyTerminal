package stepDefinition_POM;



import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import pageObjects.LandingPage;
import utils.Testcontextsetup;

public class Landingpage_POM {
	public String offerPageproname;
	Testcontextsetup Testcontextsetup;
	LandingPage LandingPage;
	public Landingpage_POM (Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		 this.LandingPage=Testcontextsetup.PageObjectManager.getLandingPage();
	}
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(LandingPage.getTitleLandingPage().contains("GreenKart"));
		//everything happens in backend in Testcontextsetup
	}

	@When("user searched with shortname {string} extracted actual name of product")
	public void user_searched_with_shortname_extracted_actual_name_of_product(String shortname) throws InterruptedException {

	    
//		LandingPage LandingPage=Testcontextsetup.PageObjectManager.getLandingPage();
		LandingPage.searchItem(shortname);
	
		Testcontextsetup.landingpageproductname=LandingPage.getProductName().split("-")[0].trim();
		System.out.println(Testcontextsetup.landingpageproductname+" is extracted from home page");
	
	
	}
	  @And("Added {string} items of the selected product to cart")
	    public void added_something_items_of_the_selected_product_to_cart(String quantity)  {
	    	LandingPage.incrementQuantity(Integer.parseInt(quantity));//convert string into int
	    	LandingPage.addToCart();
	    }
	   @When("^user searched with shortnames (.+) extracted actual name of product$")
	    public void user_searched_with_shortnames_extracted_actual_name_of_product(String name) throws InterruptedException {
			LandingPage LandingPage=Testcontextsetup.PageObjectManager.getLandingPage();
			LandingPage.searchItem(name);
		
			Testcontextsetup.landingpageproductname=LandingPage.getProductName().split("-")[0].trim();
			System.out.println(Testcontextsetup.landingpageproductname+" is extracted from home page");
	    }

	  
}
