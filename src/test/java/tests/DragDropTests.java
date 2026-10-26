package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.DragDropPage;

public class DragDropTests extends Base_Class{
	
	@Test
	public void calling() {
		
		DragDropPage ddp = new DragDropPage(driver);
		ddp.dragAndDrop();
		
		String actualMessage = ddp.getDropableMsg();
		
		Assert.assertTrue(actualMessage.contains("Dropped!"),"dropped message is not displayed");
	}

}
