package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base_Class;
import pages.LinksLabelsPage;

public class LinksLabelsTests extends Base_Class{
	
	@Test
	public void calling() throws IOException {
		
		LinksLabelsPage llpp = new LinksLabelsPage(driver);
		llpp.brokenLink();
	}

}
