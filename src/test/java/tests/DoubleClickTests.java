package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.DoubleClickPage;

public class DoubleClickTests extends Base_Class {
	
	@Test
	public void calling() {
		
		 DoubleClickPage dcp = new DoubleClickPage(driver);
		    dcp.doubleClick(); // perform the double-click action

		    // get the message text after double-click
		    String actualMessage = dcp.getCopyText();

		    // verify the message is displayed correctly
		    Assert.assertTrue(actualMessage.contains("Hello World!"), "The copy message is not displayed");
		
	}

}
