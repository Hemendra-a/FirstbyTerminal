package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.Testcontextsetup;

public class OfferPageStepDefinition {
    public String parentwindow;
	public String offerPageproname;	
	Testcontextsetup Testcontextsetup;
	public OfferPageStepDefinition (Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
	}
	
//	@Given("User is on GreenCart Landing Page")
//	public void user_is_on_green_cart_landing_page() {
//		System.setProperty("webdriver.edge.driver","C:\\Users\\winni\\eclipse-workspace1\\CucumberFramework\\Driver\\msedgedriver.exe");
//	   driver=new EdgeDriver();
//	   //greenkart landing page
//	   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//	   
//	}

//	@When("user searched with shortname {string} extracted actual name of product")
//	public void user_searched_with_shortname_extracted_actual_name_of_product(String shortname) {
//	   driver.findElement(By.xpath("//*[@placeholder='Search for Vegetables and Fruits']")).sendKeys(shortname);
//	   landingpageproductname=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[6]/h4")).getText().split("-")[0].trim();
//	   System.out.println(landingpageproductname+" is extracted from home page");
//	}

	@Then("User searched for same {string} shortname in offers page to check if product exist with same name")
    public void user_searched_for_same_something_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortName) {
		switchToofferpage();
//		Testcontextsetup.driver.findElement(By.xpath("//*[@href='#/offers']")).click();
//	   //window handel
//	   Set<String>s1=Testcontextsetup.driver.getWindowHandles();
//	   Iterator<String>i1=s1.iterator();
//	   String parentwindow=i1.next();
//	   String childwindow=i1.next();
//	   Testcontextsetup.driver.switchTo().window(childwindow);
	   Testcontextsetup.driver.findElement(By.xpath("//*[@id='search-field']")).sendKeys(shortName);
	   offerPageproname=Testcontextsetup.driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/table/tbody/tr/td[1]")).getText();
	   System.out.println( offerPageproname+" is extracted from offer page");
	   Assert.assertEquals(Testcontextsetup.landingpageproductname, offerPageproname);
	   Testcontextsetup.driver.switchTo().window(parentwindow);
       Testcontextsetup.driver.quit();
	}
	//now we can optimize the code we acchive reuseability
     public void switchToofferpage() {
 		Testcontextsetup.driver.findElement(By.xpath("//*[@href='#/offers']")).click();
 	   //window handel
 	   Set<String>s1=Testcontextsetup.driver.getWindowHandles();
 	   Iterator<String>i1=s1.iterator();
 	    parentwindow=i1.next();
 	   String childwindow=i1.next();
 	   Testcontextsetup.driver.switchTo().window(childwindow);
     }
}
