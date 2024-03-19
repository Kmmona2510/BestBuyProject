package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Signinpage extends ProjectSpecification {

	public Signinpage(WebDriver driver) {

		this.driver = driver;

	}

	//give the email value
	public Signinpage email(String email) {

		findElement("id", "fld-e").sendKeys(email);
		return this;

	}

	//give the password value
	public Signinpage password(String password) {

		findElement("id", "fld-p1").sendKeys(password);
		return this;
	}

	//give the sign in button
	public Signinpage signinbutton() {

		findElement("Xpath", "//button[text()='Sign In']").click();
		return this;
	}

}
