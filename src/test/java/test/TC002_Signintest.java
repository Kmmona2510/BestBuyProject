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
import pages.Signinpage;

public class TC002_Signintest extends ProjectSpecification {

	@BeforeTest
	public void excelfile() {
		excelfile = "signintestdata";
	}

	@Test(dataProvider = "exceldata")
	public void testsignin(String email, String password, String match) throws InterruptedException {

		Entrypage page = new Entrypage(driver);
		page.choosecountry();
		Homepage signin = new Homepage(driver);
		signin.signin().email(email).password(password).signinbutton();

		// verification
		if (match.equals("correct")) {

			WebElement element = driver
					.findElement(By.xpath("//div[text()='Sorry, something went wrong. Please try again.']"));
			String accouncttext = element.getText();
			Assert.assertEquals(accouncttext, "Sorry, something went wrong. Please try again.");
			System.out.println("Successfully signed in");

		}

		else if (match.equals("emailwrong")) {
			WebElement emailele = driver.findElement(By.xpath("//p[text()='Please enter a valid email address.']"));
			String emailtext = emailele.getText();
			Assert.assertEquals(emailtext, "Please enter a valid email address.");
			System.out.println("Enter valid email address");

		}

		else if (match.equals("passwordwrong")) {
			WebElement passele = driver
					.findElement(By.xpath("//div[text()='Sorry, something went wrong. Please try again.']"));
			String passtext = passele.getText();
			Assert.assertEquals(passtext, "Sorry, something went wrong. Please try again.");
			System.out.println("Enter correct password");
		}

		else {
			System.out.println("Enter correct email and password");
		}

	}

}
