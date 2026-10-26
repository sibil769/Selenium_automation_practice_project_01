package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.MouseHoverPage;

public class MouseHoverTests extends Base_Class{
	
	@Test
	public void mouseHoverCalling() throws InterruptedException {
		MouseHoverPage mhp = new MouseHoverPage(driver);
		mhp.dataEntryForm();
		Thread.sleep(2000);
		mhp.MouseHover();
		
		String actualMessage = mhp.getDropDown();
		
		Assert.assertTrue(actualMessage.contains("Mobiles"),"mobile is not selected");
		
		
	}

}
