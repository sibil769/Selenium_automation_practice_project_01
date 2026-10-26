package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTabPage {
	
	WebDriver driver;
	
	public NewTabPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void multiTabeHandling() {
		
		WebElement udemmyCourses = driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[2]/a"));
		udemmyCourses.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows= driver.getWindowHandles();
		
		for(String window : allWindows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
			
		}
		
		String dvr=driver.getCurrentUrl();
		System.out.println("current url is "+dvr);
	}

}
