package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPage {
	
	WebDriver driver;
	
	public MouseHoverPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void MouseHover() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement pointMe = driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions action = new Actions(driver);
		action.moveToElement(pointMe).perform();
		
	}
	
	public void dataEntryForm() {
		WebElement def = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a"));
		Actions action = new Actions(driver);
		action.moveToElement(def).perform();
		
	}
	
	public String getDropDown() {
		WebElement mob = driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[1]"));
		return mob.getText();
	}

}
