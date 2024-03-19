package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC008_Checkouttest  extends ProjectSpecification{
	@Test
	public void payment() throws InterruptedException {
		
		Entrypage entry = new Entrypage(driver);
		entry.choosecountry();
		
		//checkout test		
		Homepage pay = new Homepage(driver);
		pay.searchtoadd()
		.clickitem()
		.addtocart();
		pay.checkoutcart()
		.clickcheckout()
		.customersignin()
		.gettingorder();
		//.deliverydetails().datepick().payment_details();
		
		
		//validtion for order placed
		WebElement ccele =findElement("Xpath", "//span[text()='Request failed because of network connection']");
		
		String cctext = ccele.getText();
		
		if(cctext.equals("Request failed because of network connection")) {
			System.out.println("place the order");
		}
		
		else {
			
			System.out.println("Not place the order");
		}
		
		
	}

}
