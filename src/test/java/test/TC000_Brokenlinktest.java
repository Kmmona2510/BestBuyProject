package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;

public class TC000_Brokenlinktest extends ProjectSpecification {
	@Test
	public void urlbroken() throws IOException, InterruptedException {
		// check given link is broken or not
		Entrypage page = new Entrypage(driver);
		page.choosecountry().brokenlinks();

	}

}
