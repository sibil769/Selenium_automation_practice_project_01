package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {
	
	WebDriver driver;
	
	public DragDropPage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//for drag and drop action
	public void dragAndDrop() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		WebElement dropablee = driver.findElement(By.id("droppable"));
		WebElement dragObject = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragObject, dropablee).perform();
		
	}
	
	//for returning the data caused by the drag and drop method
	public String getDropableMsg() {
		WebElement dropable= driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		return dropable.getText();
	}

}
