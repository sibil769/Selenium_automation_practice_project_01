package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.FileUploadPage;

public class FileUploadTests extends Base_Class{
	
	@Test
	public void calling() throws Exception {
		
	    FileUploadPage fup = new FileUploadPage(driver);
	    fup.singleFileUpload();
	    
	    String actualMessage = fup.getvisibleTextsingleFile();	    
	    Assert.assertTrue(actualMessage.contains("Single file selected:"),"file selected isn't displayed");
	    
	    Thread.sleep(5000);	       
	    fup.multipleFileUploads();
	    
	    String actualMessage2 = fup.getvisibleTextmultiFile();	    
	    Assert.assertTrue(actualMessage2.contains("Multiple files selected:"),"multiple file selected isn't displayed");
	    
	    
	    
	}


}
