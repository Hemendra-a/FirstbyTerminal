package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;
public class Testcontextsetup {
	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager  PageObjectManager ;
	public TestBase testbase;
	public GenricUtils  genricUtils;
	public  Testcontextsetup() throws IOException {
		testbase=new TestBase();
		PageObjectManager =new PageObjectManager (testbase.WebDriverManager());
		genricUtils =new GenricUtils(testbase.WebDriverManager());
	}
}
