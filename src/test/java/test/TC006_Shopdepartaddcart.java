package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC006_Shopdepartaddcart  extends ProjectSpecification {
	@Test
	public void addcartshop() {
		
		Entrypage entry = new Entrypage(driver);
		entry.choosecountry();
		//add cart by shop
		Homepage shop = new Homepage(driver);
		shop.addtoshop().selectitemshop();

		
		
	}

}
