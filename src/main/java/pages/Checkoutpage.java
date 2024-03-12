package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Checkoutpage extends ProjectSpecification {

	public Checkoutpage(WebDriver driver) {
		this.driver = driver;
	}

// to checkout the cart
	public Checkoutpage clickcheckout() throws InterruptedException {

		findElement("Xpath", "//button[text()='Checkout']").click();

		try {
			WebElement element = findElement("Xpath", "(//button[@aria-label='Close'])[2]]");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Actions act = new Actions(driver);
			act.click(element).perform();
		} catch (Exception e) {
			System.out.println("The pop-up skipped ");
		}

		findElement("Xpath", "//button[text()='Checkout']").click();

		return this;

	}

//customer signin details
	public Checkoutpage customersignin() {

		findElement("Xpath", "//button[text()='Continue as Guest']").click();
		/*
		 * findElement("id", "fld-e").sendKeys("ramkumar@gmail.com"); findElement("id",
		 * "fld-p1").sendKeys("Ramkumar@123"); findElement("Xpath",
		 * "//button[text()='Sign In']").click();
		 * 
		 * //Alert alert = driver.switchTo().alert(); //alert.accept();
		 */
		return this;
	}

//customer delivery details
	public Checkoutpage deliverydetails() {

		findElement("id", "firstName").sendKeys("Ram");

		findElement("id", "lastName").sendKeys("kumar");

		findElement("id", "street").sendKeys("15th St");

		findElement("id", "save-for-billing-address-Map {}").click();

		findElement("Xpath", "//button[text()='Apply']").click();

		findElement("Xpath", "//span[text()='Continue to Schedule Delivery']").click();

		return this;
	}

//use to pick the date
	public Checkoutpage datepick() {

		String expectedMonth = "March"; // get the month

		int selectDate = 15; // get the date

		while (true) { // verify the actual month is equals to expected month
			String actualMonth = driver.findElement(By.xpath("/caption[text()='March 2024']")).getText();

			if (expectedMonth.equals(actualMonth)) {

				break;

			} // if its not click the arrow unit expected reach
			else {
				driver.findElement(By.xpath("(//span[@class='sr-only'])[4]")).click();
			}

		}
		// click the selected date
		driver.findElement(By.xpath("//table//tr//td[//span[text()='15']")).click();

		// print the selected date
		String date = driver.findElement(By.xpath("[//span[text()='15']")).getText();

		return this;

	}

//payment details
	public Checkoutpage payment_details() {

		findElement("id", "number").sendKeys("6541 2378 9012 3685");

		WebElement selectele = findElement("id", "expMonth");

		Select select = new Select(selectele);
		select.selectByIndex(4);

		WebElement year = findElement("id", "expYear");

		Select yearselect = new Select(year);
		yearselect.selectByIndex(2);

		findElement("id", "cvv").sendKeys("123");

		findElement("id", "first-name").sendKeys("Ram");

		findElement("id", "last-name").sendKeys("kumar");

		findElement("id", "address-input").sendKeys("15 1 Dr");

		findElement("Xpath", "//span[text()='Place Your Order']").click();

		return this;
	}

}
