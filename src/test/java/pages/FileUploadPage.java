package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage {
	
	WebDriver driver;
	
	public FileUploadPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void singleFileUpload() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		String file1="C:\\Users\\sibil\\OneDrive\\Documents\\Code explanation\\Selenium_Classes_And_Methods.pdf";
		
		WebElement chooseFile= driver.findElement(By.id("singleFileInput"));
		chooseFile.sendKeys(file1);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button"));
		uploadBtn.click();
		
	}
	
	
	public void multipleFileUploads() {
		
		String file1 = "C:\\Users\\sibil\\OneDrive\\Documents\\Code explanation\\Selenium_Classes_And_Methods.pdf";
	    String file2 = "C:\\Users\\sibil\\OneDrive\\Documents\\Code explanation\\roadmap_for_automaton_testing.pdf";
	    
	    WebElement chooseFile = driver.findElement(By.id("multipleFilesInput"));
	    chooseFile.sendKeys(file1 + "\n" + file2);
	    	    
	    WebElement uploadBtn1= driver.findElement(By.xpath("//*[@id=\"multipleFilesForm\"]/button"));
	    uploadBtn1.click();

	   
	}
	
	public String getvisibleTextsingleFile() {
		
		WebElement fileSltd = driver.findElement(By.id("singleFileStatus"));
		return fileSltd.getText();
		
		
	}
	
	
	public String getvisibleTextmultiFile() {
		
		WebElement multifileSltd = driver.findElement(By.id("multipleFilesStatus"));
		return multifileSltd.getText();
		
		
	}
	

}
