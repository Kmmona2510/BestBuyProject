package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC004_Bottomlinktest extends ProjectSpecification {
	
	@Test
	public void bottomlink() {
		
		Entrypage entry = new Entrypage(driver);
		entry.choosecountry();
		//bottom links navigation
		Homepage bottom = new Homepage(driver);
		bottom.bottomlinksnavigate();
		
	}

}
