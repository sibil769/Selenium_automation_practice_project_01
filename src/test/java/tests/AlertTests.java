package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Class;
import pages.AlertsPage;

public class AlertTests extends Base_Class {
	
	@Test	
	public void alertCalling() throws InterruptedException {
		
		//for simple alert
		Thread.sleep(2000);
		AlertsPage ap = new AlertsPage(driver);
		ap.simpleAlertAccept();
		
		//for conformation alert
		Thread.sleep(2000);		
		ap.conformationAlertDismiss();		
		String actualMessage = ap.getCancelMsg();
		Assert.assertTrue(actualMessage.contains("You pressed Cancel!")," 'You pressed Cancel' is not displayed");
		
		//for prompt alert
		Thread.sleep(2000);
		ap.promptAlert();
		String actualMessage1 = ap.getOkMsg();
		Assert.assertTrue(actualMessage1.contains("Hello Sibil sivadas! How are you today?"),"the corresponding message of 'OK' isn't displayeds");
		
	}

}
