package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Createaccountpage extends ProjectSpecification {

	public Createaccountpage(WebDriver driver) {

		this.driver = driver;
	}

	//give the firstname value
	public Createaccountpage firstName(String firstname) {

		findElement("id", "firstName").sendKeys(firstname);
		return this;

	}

	//give lastname value
	public Createaccountpage lastName(String lastname) {

		findElement("id", "lastName").sendKeys(lastname);
		return this;
	}

	//give the email
	public Createaccountpage email(String email) {

		findElement("id", "email").sendKeys(email);
		return this;
	}

	//give the password
	public Createaccountpage password(String password) {

		findElement("id", "fld-p1").sendKeys(password);
		return this;
	}

	// give the confirm password
	public Createaccountpage confirmpassword(String confirmpassword) {

		findElement("id", "reenterPassword").sendKeys(confirmpassword);
		return this;
	}

	//give the mobile number
	public Createaccountpage mobileNumber(String number) {

		findElement("id", "phone").sendKeys(number);
		return this;
	}

	// click the account create button
	public Createaccountpage createbutton() {

		findElement("Xpath", "//button[text()='Create an Account']").click();
		return this;
	}

}
