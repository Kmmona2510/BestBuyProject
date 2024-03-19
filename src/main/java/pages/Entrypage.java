package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Entrypage  extends ProjectSpecification{
	
	public Entrypage (WebDriver driver) {
		this.driver = driver;
	}
	//choose the country
	public Entrypage choosecountry() {
		
		findElement("Xpath", "(//img[@alt='United States'])[1]").click();
		return this;
		
	}

}
