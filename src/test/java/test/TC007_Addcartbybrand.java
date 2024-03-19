package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC007_Addcartbybrand  extends ProjectSpecification{
	@Test
	public void addbrandcart() throws IOException {
		
		Entrypage entry = new Entrypage(driver);
		entry.choosecountry();
		
		//add cart to brand
		Homepage brand =new Homepage(driver);
		brand.addtoBrand().addbrand();
		
	}

}
