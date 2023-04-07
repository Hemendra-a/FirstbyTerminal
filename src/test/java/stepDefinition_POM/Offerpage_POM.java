package stepDefinition_POM;



import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.Testcontextsetup;

public class Offerpage_POM {
	 public String parentwindow;
		public String offerPageproname;	
		Testcontextsetup Testcontextsetup;
		public Offerpage_POM (Testcontextsetup Testcontextsetup) {
			this.Testcontextsetup=Testcontextsetup;
		}
		
		@Then("User searched for same {string} shortname in offers page to check if product exist with same name")
	    public void user_searched_for_same_something_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortName){
			switchToofferpage();
      		//OfferPage offerPage=new OfferPage( Testcontextsetup.driver);
			OfferPage offerPage=Testcontextsetup.PageObjectManager.OfferPage();
			offerPage.searchItem(shortName);
			offerPageproname=offerPage.getProductName();
			
		   System.out.println( offerPageproname+" is extracted from offer page");
		   Assert.assertEquals(Testcontextsetup.landingpageproductname, offerPageproname);
//		   Testcontextsetup.driver.switchTo().window(parentwindow);
	      
		}
		   @Then("^User searched for same (.+) shortnames in offers page to check if product exist with same name$")
		    public void user_searched_for_same_shortnames_in_offers_page_to_check_if_product_exist_with_same_name(String name) {
				switchToofferpage();
	      		
			OfferPage offerPage=Testcontextsetup.PageObjectManager.OfferPage();
			   offerPage.searchItem(name);
			   offerPageproname=offerPage.getProductName();
			   System.out.println( offerPageproname+" is extracted from offer page");
			   Assert.assertEquals(Testcontextsetup.landingpageproductname, offerPageproname);
		  System.out.println(Testcontextsetup.landingpageproductname.equalsIgnoreCase(offerPageproname));
		    }
		//now we can optimize the code we acchive reuseability
	         public void switchToofferpage() {
	    	 LandingPage LandingPage=Testcontextsetup.PageObjectManager.getLandingPage();
	    	 LandingPage.selectTopDealsPage();
	    	 Testcontextsetup.genricUtils.SwitchWindowToChild();
	    	 

	     }
}
