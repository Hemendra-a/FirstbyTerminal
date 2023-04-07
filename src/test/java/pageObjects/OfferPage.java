package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
     By search=By.xpath("//*[@id='search-field']");//encapsulation
     By offerpageproductName=By.xpath("//*[@id='root']/div/div/div/div/div/div/table/tbody/tr/td[1]");
    
    public void searchItem(String name) {
    
    	driver.findElement(search).sendKeys(name);
    }
    public void getsearchText() {
    	driver.findElement(search).getText();
    }
    public String getProductName() {
    	return driver.findElement(offerpageproductName).getText();
    }
 
}
