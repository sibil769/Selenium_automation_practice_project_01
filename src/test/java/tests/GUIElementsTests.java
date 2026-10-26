package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.GUIElementsPage;

public class GUIElementsTests extends Base_Class{
	
	@Test(priority=1)	
	public void input_calling() {
		
		GUIElementsPage gep = new GUIElementsPage(driver);
		gep.inputs(config.getProperties("name"),config.getProperties("email"),config.getProperties("phone"),config.getProperties("address"));
		
	}
	
	@Test(priority=2)	
	public void btnCalling() {
		
		GUIElementsPage gep = new GUIElementsPage(driver);
		gep.radioBtnAndChkBox();
		
		
	}
	
	@Test(priority=3)	
	public void dropDownCalling() {
		
		GUIElementsPage gep = new GUIElementsPage(driver);
		gep.dropDowns();
		
		String actualMessage = gep.getCountry();		
		Assert.assertTrue(actualMessage.contains("Japan"),"selected country is not displayed");
		
		String actualMessage2 = gep.getColor();
		Assert.assertTrue(actualMessage2.contains("White"),"selected color is not displayed");
		
		String actualMessage3 = gep.getAnimals();
		Assert.assertTrue(actualMessage3.contains("Dog"),"selected animal is not displayed");
		
		
		
	}

}
