package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Additemtoshopdepart extends ProjectSpecification {
	// constructor
	public Additemtoshopdepart(WebDriver driver) {

		this.driver = driver;
	}

	// add item to cart by selecting the menu by department
	public Additemtoshopdepart selectitemshop() {

		findElement("linkText", "Laptops with 16GB RAM or more").click();

		findElement("Xpath", "//button[contains(text(),'Add to Cart')]").click();

		return this;

	}

}
