package tests;

import org.testng.annotations.Test;

import base.Base_Class;
import pages.NewTabPage;

public class NewTabTests extends Base_Class {
	
	@Test
	public void calling() {
		NewTabPage ntp = new NewTabPage(driver);
		ntp.multiTabeHandling();
	}

}
