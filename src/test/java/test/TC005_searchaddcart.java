package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC005_searchaddcart  extends ProjectSpecification{
	@Test
	public void addcart() {
		
		Entrypage entry = new Entrypage(driver);
		entry.choosecountry();
		
		//add the cart by search
		Homepage search = new Homepage(driver);
		search.searchtoadd().clickitem().addtocart();
		
	}

}
