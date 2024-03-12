package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Additembybrand extends ProjectSpecification {
	// constructor chaining
	public Additembybrand(WebDriver driver) {

		this.driver = driver;
	}

	// add the item by clicking the selected brand
	public Additembybrand addbrand() {

		findElement("linkText", "LG refrigerators").click();

		findElement("Xpath", "//button[contains(text(),'Add to Cart')]").click();

		return this;
	}

}
