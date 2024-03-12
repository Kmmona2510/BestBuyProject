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
		pay.addtoBrand().addbrand();
		pay.checkoutcart().clickcheckout().customersignin().deliverydetails().datepick().payment_details();
		
		WebElement ccele =findElement("Xpath", "//p[text()='Please enter a valid card number.']");
		
		String cctext = ccele.getText();
		
		if(cctext.equals("//p[text()='Please enter a valid card number.")) {
			Assert.assertEquals(cctext, "Please enter a valid card number.");
			System.out.println("place the order");
		}
		
		else {
			
			System.out.println("Not place the order");
		}
		
		
	}

}
