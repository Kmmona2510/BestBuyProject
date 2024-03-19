package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecification;

public class Homepage extends ProjectSpecification {

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	//click create account button
	public Createaccountpage account_Createaccount() {

		findElement("Xpath", "//span[text()='Account']").click();
		findElement("linkText", "Create Account").click();
		return new Createaccountpage(driver);

	}

	//click sign in button
	public Signinpage signin() throws InterruptedException {

		findElement("Xpath", "//span[text()='Account']").click();
		findElement("Xpath", "//a[text()='Sign In']").click();
		return new Signinpage(driver);

	}

	//click menu navigation
	public Menunavigation topdeal() {

		// topdeal menu navigation
		findElement("linkText", "Top Deals").click();
		String titleTop = driver.getTitle();

		//verification of topdeal navigation
		if (titleTop.contains("Top Deals and")) {

			System.out.println("The page navigate to Top deals");
		}

		else {
			
			System.out.println("Not navigat to Top deals");
		}
		

		// Deal of the day menu navigation
		findElement("linkText", "Deal of the Day").click();
		String dealtitle = driver.getTitle();

		
		//validation of deal of the navigation
		if (dealtitle.contains("Deal of the Day")) {

			System.out.println("The page is in Deal of the day");
		}

		else {

			System.out.println("The page is not navigate");
		}

		
		// Yes Best Buy menu navigation
		findElement("linkText", "Yes, Best Buy Sells That").click();
		String bestbuytitle = driver.getTitle();
		
		//validation of best buy title
		if (bestbuytitle.contains("Yes, Best Buy Sells That")) {

			System.out.println("The page is in the Best Buy Sells");
		}

		else {
			
			System.out.println("The page is not Best Buy");
		}

		
		// My Best Buy Membership navigation
		findElement("linkText", "My Best Buy Memberships").click();
		String membershiptitle = driver.getTitle();
		
		//validation of my best buy membership navigation
		if (membershiptitle.contains("My Best Buy Memberships")) {

			System.out.println("The page is in My Best Buy Membership");
		}

		else {
			
			System.out.println("The page is not My Best Buy Membership");
		}

		
		// credit card navigation
		findElement("linkText", "Credit Cards").click();
		String creditcardtitle = driver.getTitle();
		
		
		//verification of creditcard navigation
		if (creditcardtitle.contains("Credit Card")) {

			System.out.println("The page is in Credit Cards");
		}

		else {
			
			System.out.println("The page is not Credit Cards");
		}

		// Gift card navigation
		findElement("linkText", "Gift Cards").click();
		String giftcardtitle = driver.getTitle();
		
		//verification of giftcard navigation  
		if (giftcardtitle.contains("Gift Card")) {

			System.out.println("The page is in Gift Card");
		}

		else {
			
			System.out.println("The page is not Gift Card");
		}

		// Gift ideas navigation
		findElement("linkText", "Gift Ideas").click();
		String giftideatitle = driver.getTitle();

		//verification of giftcard navigation
		if (giftideatitle.contains("Gift Ideas")) {

			System.out.println("The page is in Gift Ideas");
		}

		else {
			
			System.out.println("The page is not Gift Ideas");
		}

		return new Menunavigation(driver);
	}

	
	//bottom link navigation
	public Bottomlinks bottomlinksnavigate() {

		findElement("linkText", "Accessibility").click();
		String accessibilitytitle = driver.getTitle();
		
		//verification of bottom links
		if (accessibilitytitle.contains("Accessibility")) {
			
			System.out.println("The page is navigate in Accessibility");
			
		} else {
			
			System.out.println("The page is not in Accessibility");
		}

		findElement("linkText", "Terms & Conditions").click();
		String termstitle = driver.getTitle();

		if (termstitle.contains("Terms and Conditions")) {

			System.out.println("The page is in Terms and conditions");
		}

		else {
			
			System.out.println("The page is not in Terms and conditions");
		}

		return new Bottomlinks(driver);
	}

	//search to add item
	public Additemtosearch searchtoadd() {

		findElement("id", "gh-search-input").sendKeys("laptop");
		findElement("className", "header-search-icon").click();
		return new Additemtosearch(driver);

	}

	//by department select to add item
	public Additemtoshopdepart addtoshop() {

		findElement("Xpath", "(//button[@type='button'])[2]").click();
		findElement("Xpath", "//button[contains(text(),'Computers & Tablets')]").click();
		findElement("Xpath", "//button[contains(text(),'Laptops & Desktops')]").click();
		findElement("linkText", "Laptops").click();
		return new Additemtoshopdepart(driver);

	}

	//By brand add item
	public Additembybrand addtoBrand() {

		findElement("Xpath", "(//button[@type='button'])[2]").click();
		findElement("Xpath", "//button[contains(text(),'Brands')]").click();
		findElement("linkText", "LG").click();
		return new Additembybrand(driver);

	}

	// checkout the cart
	public Checkoutpage checkoutcart() {

		findElement("Xpath", "//span[contains(text(),'Cart')]").click();
		return new Checkoutpage(driver);

	}

}
