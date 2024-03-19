package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Entrypage;
import pages.Homepage;

public class TC001_Createaccounttest extends ProjectSpecification {

	@BeforeTest
	public void testdataFile() {
		excelfile = "createaccount_testdata";

	}

	@Test(dataProvider = "exceldata")
	public void createaccount_test(String firstname, String lastname, String email, String password,
			String confirmpassword, String mobilenumber, String match) throws InterruptedException {

		Entrypage page = new Entrypage(driver);
		page.choosecountry();

		Homepage homeobj = new Homepage(driver);
		Thread.sleep(3000);
		homeobj.account_Createaccount()
		.firstName(firstname)
		.lastName(lastname)
		.email(email)
		.password(password)
		.confirmpassword(confirmpassword)
		.mobileNumber(mobilenumber)
		.createbutton();
		

		// use assertion for verification
		Thread.sleep(1000);
		if (match.contains("correct")) {
			
			WebElement actualtext = driver.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
			String text = actualtext.getText();
			System.out.println(text);
			Assert.assertEquals(text, "An account with this email already exists.");
		}

		else if (match.equals("emailwrong")) {

			WebElement emailele = driver.findElement(By.xpath("//p[text()='Please enter a valid email address.']"));
			String emailtext = emailele.getText();
			Assert.assertEquals(emailtext, "Please enter a valid email address.");
			System.out.println("Enter correct email");

		}

		else if (match.equals("passwordwrong")) {
			
			WebElement passele = driver.findElement(By.xpath("//p[text()='Please enter a strong password.']"));
			String passtext = passele.getText();
			Assert.assertEquals(passtext, "Please enter a strong password.");
			System.out.println("Enter the correct password");
		}

		else if (match.equals("confirmpasswordwrong")) {
			
			WebElement confirmpassele = driver.findElement(By.xpath("//p[text()='Passwords do not match.']"));
			String confirmpasstext = confirmpassele.getText();
			Assert.assertEquals(confirmpasstext, "Passwords do not match.");
			System.out.println("Enter the matched password");
		}

		else if (match.equals("phonenumberwrong")) {
			
			WebElement phoneele = driver.findElement(By.xpath("//p[text()='Please enter a valid mobile phone number.']"));
			String phonetext = phoneele.getText();
			Assert.assertEquals(phonetext, "Please enter a valid mobile phone number.");
			System.out.println("Enter the correct phonenumber");
		}

		else {
			
			System.out.println("Enter correct values");
		}

	}

}
