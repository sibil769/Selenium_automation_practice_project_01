package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {
	
	WebDriver driver;
	
	public DoubleClickPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//for double click action
	public void doubleClick() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1150)");
		
		WebElement copy = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(copy).perform();
		
	}
	
	// for returing the text caused by double click
	public String getCopyText() {
		
		WebElement copyText = driver.findElement(By.id("field1"));
		return copyText.getAttribute("value");
		
	}

	

}
