package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC003_Menunavigatetest extends ProjectSpecification {
	@Test
	public void navigation() throws IOException, InterruptedException {
		
		//choose country
		Entrypage page = new Entrypage(driver);
		page.choosecountry();
		
		// all menu navigation
		Homepage top = new Homepage(driver);
		
		top.topdeal();
		

		
		
		
	}

}
