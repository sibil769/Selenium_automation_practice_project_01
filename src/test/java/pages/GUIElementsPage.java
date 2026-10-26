package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GUIElementsPage {
	
	WebDriver driver;
	
	public GUIElementsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void inputs(String iname,String iemail,String iphno,String iaddress) {
		
		WebElement nameid = driver.findElement(By.id("name"));
		nameid.sendKeys(iname);
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys(iemail);
		
		WebElement phonenum = driver.findElement(By.id("phone"));
		phonenum.sendKeys(iphno);
		
		WebElement addr = driver.findElement(By.id("textarea"));
		addr.sendKeys(iaddress);		
		
	}
	
	public void radioBtnAndChkBox() {
		
		WebElement rad1= driver.findElement(By.id("female"));
		rad1.click();
		
		
		WebElement check1 = driver.findElement(By.id("monday"));
		check1.click();
		
		WebElement chkeck2 = driver.findElement(By.id("friday"));
		chkeck2.click();
		
	}
	
	public void dropDowns() {
		
		// Country dropdown
	    WebElement countryElement = driver.findElement(By.id("country"));
	    Select country = new Select(countryElement);
	    country.selectByVisibleText("Japan");

	    // Color dropdown
	    WebElement colorElement = driver.findElement(By.id("colors"));
	    Select color = new Select(colorElement);
	    color.selectByVisibleText("White");

	    // Animal dropdown
	    WebElement animalElement = driver.findElement(By.id("animals"));
	    Select animal = new Select(animalElement);
	    animal.selectByVisibleText("Dog");
		
		
	}
	
	public String getCountry() {
		
		WebElement countrySlted = driver.findElement(By.id("country"));
		return countrySlted.getText();
		
	}
	
	public String getColor() {
		
		WebElement colorSlted = driver.findElement(By.xpath("//*[@id=\"colors\"]/option[6]"));
		return colorSlted.getText();
		
	}
	
	public String getAnimals() {
		
		WebElement animalSlted = driver.findElement(By.xpath("//*[@id=\"animals\"]/option[4]"));
		return animalSlted.getText();
		
	}


}
