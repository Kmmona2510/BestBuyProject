package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Additemtosearch extends ProjectSpecification {
	// constructor chaining
	public Additemtosearch(WebDriver driver) {
		this.driver = driver;
	}

	// search item
	public Additemtosearch clickitem() {

		findElement("Xpath", "(//span[@class='nc-product-title clamp'])[1]").click();

		return this;
	}

	// add search item to cart
	public Additemtosearch addtocart() {

		findElement("Xpath", "(//button[@data-button-state='ADD_TO_CART'])[4]").click();

		return this;
	}
}
