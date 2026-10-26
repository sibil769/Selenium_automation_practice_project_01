package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utilities.ConfigReader;

public class Base_Class {
	
	//here is start to the base page normal code
	
	public WebDriver driver;
	public ConfigReader config;
		
	@BeforeTest
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		config = new ConfigReader();
		
		driver.get(config.getProperties("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
//	
	//here is end the base page normal code
	
	
	//here is start the creoss browser code
	
//	public WebDriver driver;
//	public ConfigReader config;
//	@BeforeTest
//	@BeforeMethod
//	@Parameters("browser")
//	public void setup(String browser) throws IOException {
//		
//		config = new ConfigReader();
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			
//			driver = new ChromeDriver();			
//			
//		}
//		
//		else if(browser.equalsIgnoreCase("edge")){
//			
//			driver = new EdgeDriver();
//			
//		}
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get(config.getProperties("url"));
//		
//		driver.manage().window().maximize();
//
//		
//		
//		
//	}
//	
//here is end the cross browser code
	
	
//}
