package utils;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
public WebDriver WebDriverManager() throws IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\winni\\eclipse-workspace1\\CucumberFramework\\src\\test\\resources\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("QAUrl");
	if(driver==null) {
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\winni\\eclipse-workspace1\\CucumberFramework\\Driver\\msedgedriver.exe");
	driver=new EdgeDriver();//driver get the life
	driver.manage().window().maximize();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			//firefox
		}
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
	driver.get(value);
	}
	return driver;
   
}
}
