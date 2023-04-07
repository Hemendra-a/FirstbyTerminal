package stepDefinition;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import utils.Testcontextsetup;

public class LandingPageStepDefinition {

	public String offerPageproname;
	Testcontextsetup Testcontextsetup;
	public LandingPageStepDefinition (Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
	}
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\winni\\eclipse-workspace1\\CucumberFramework\\Driver\\msedgedriver.exe");
		Testcontextsetup.driver=new EdgeDriver();//driver get the life
		Testcontextsetup.driver.manage().window().maximize();
		
	   //greenkart landing page
		Testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   
	}

	@When("user searched with shortname {string} extracted actual name of product")
	public void user_searched_with_shortname_extracted_actual_name_of_product(String shortname) {
		Testcontextsetup.driver.findElement(By.xpath("//*[@placeholder='Search for Vegetables and Fruits']")).sendKeys(shortname);
		Testcontextsetup.landingpageproductname=Testcontextsetup.driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[6]/h4")).getText().split("-")[0].trim();
	   System.out.println(Testcontextsetup.landingpageproductname+" is extracted from home page");
	
	}

//	@Then("User searched for same {string} shortname in offers page to check if product exist with same name")
//    public void user_searched_for_same_something_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortName) {
//	   driver.findElement(By.xpath("//*[@href='#/offers']")).click();
//	   //window handel
//	   Set<String>s1=driver.getWindowHandles();
//	   Iterator<String>i1=s1.iterator();
//	   String parentwindow=i1.next();
//	   String childwindow=i1.next();
//	   driver.switchTo().window(childwindow);
//	   driver.findElement(By.xpath("//*[@id='search-field']")).sendKeys(shortName);
//	   offerPageproname=driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div/table/tbody/tr/td[1]")).getText();
//	   System.out.println( offerPageproname+" is extracted from offer page");
//	   Assert.assertEquals(landingpageproductname, offerPageproname);
//	}

}
