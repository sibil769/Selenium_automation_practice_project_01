package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
	
	WebDriver driver;
	
	public AlertsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//for simple alert
	public void simpleAlertAccept() {
		
		//for scrollling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		//getting the id of the alert button 
		WebElement accept = driver.findElement(By.id("alertBtn"));
		
		//click the alertbtn and accept the alert
		accept.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();			
		
	}
	
	//for Conformation alert
	public void conformationAlertDismiss() {
		
		//getting conform alert button id
		WebElement dismiss = driver.findElement(By.id("confirmBtn"));
		
		//click the conformation alert and dismiss 
		dismiss.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public void promptAlert() {
		
		//getting prompt alert button id
		WebElement palt = driver.findElement(By.id("promptBtn"));
		
		//click the prompt alert and accept
		palt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sibil sivadas");
		alert.accept();
	}
	
	//return the cancel message 
	public String getCancelMsg() {
		
		WebElement CancelMsg = driver.findElement(By.id("demo"));
		return CancelMsg.getText();
	}
	
	//return the accept message
	public String getOkMsg() {
		
		WebElement OkMsg = driver.findElement(By.id("demo"));
		return OkMsg.getText();
	}

}
