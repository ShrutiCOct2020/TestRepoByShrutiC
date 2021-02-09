package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;
import pojo.pojoCreateAccountDetails;

public class CreateAccountPage extends PredefinedActions {

	WebDriverWait wait = new WebDriverWait(driver, 30);

	private void enterFirstName(String firstName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname"))).sendKeys(firstName);// Shruti
	}

	private void enterLastName(String lastName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname"))).sendKeys(lastName);// Chavan
	}

	private void selectGender(String gender) {
		System.out.println("Select title");
		if (gender.equalsIgnoreCase("Male")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1"))).click();
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2"))).click();
		}
	}

	private void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd"))).sendKeys(password);// "automation"
	}

	private void selectBirthDate(String date) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-days"))).click();
		Select select = new Select(driver.findElement(By.id("days")));
		select.selectByValue(date);// 6
	}

	private void selectBirthMonth(String month) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-months"))).click();
		Select select = new Select(driver.findElement(By.id("months")));
		select.selectByValue(month);// "2"
	}

	private void selectBirthYear(String year) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-years"))).click();
		Select select = new Select(driver.findElement(By.id("years")));
		select.selectByValue(year);// "1997"
	}

	private void enterCompanyName(String company) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company"))).sendKeys(company);// "ABC"
	}

	private void enterAddress(String address) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1"))).sendKeys(address);
	}

	private void enterCity(String city) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city"))).sendKeys(city);// "nashville"
	}

	private void selectState(String state) {
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("uniform-id_state")))).click();
		Select select = new Select(driver.findElement(By.id("id_state")));
		select.selectByVisibleText(state);// "Tennessee"
	}

	private void enterPostCode(String postCode) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postcode"))).sendKeys(postCode);// "37211"
	}

	private void enterOtherInfo(String otherInfo) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("other"))).sendKeys(otherInfo); // NA
	}

	private void enterPhoneNum(String phoneNum) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone"))).sendKeys(phoneNum);// "8905714840"
	}

	private void enterMobileNum(String mobileNum) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone_mobile"))).sendKeys(mobileNum);// "8905714840"
	}

	public void enterYourDetails(pojoCreateAccountDetails pojoCreateAccountDetails) {

		System.out.println("Navigate to create account page");

		System.out.println("Select Mr. as title");
		selectGender(pojoCreateAccountDetails.getGender());

		System.out.println("Enter First Name");// -------------
		enterFirstName(pojoCreateAccountDetails.getFirstName());

		System.out.println("Enter Last Name");// -------------------
		enterLastName(pojoCreateAccountDetails.getLastName());

		System.out.println("Enter Password");
		enterPassword(pojoCreateAccountDetails.getPassword());

		// wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("uniform-days")))).click();

		System.out.println("Birthdate selected from drop down");
		selectBirthDate(pojoCreateAccountDetails.getDays());

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-months"))).click();

		System.out.println("Birth month selected");
		selectBirthMonth(pojoCreateAccountDetails.getMonth());

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-years"))).click();

		System.out.println("Birth year selected");
		selectBirthYear(pojoCreateAccountDetails.getYear());

		System.out.println("Company Name is entered");
		enterCompanyName(pojoCreateAccountDetails.getCompany());

		System.out.println("Address Name is entered");
		enterAddress(pojoCreateAccountDetails.getAddress());

		System.out.println("City Name is entered");
		enterCity(pojoCreateAccountDetails.getCity());

		System.out.println("State is selected");
		selectState(pojoCreateAccountDetails.getState());

		System.out.println("Postcode is entered");
		enterPostCode(pojoCreateAccountDetails.getPostcode());

		System.out.println("Other information is entered");
		enterOtherInfo(pojoCreateAccountDetails.getOther());

		System.out.println("Home mobile number is entered");
		enterPhoneNum(pojoCreateAccountDetails.getPhone());

		System.out.println("Mobile number is entered");
		enterMobileNum(pojoCreateAccountDetails.getMobileNum());
	}

	public ProfilePage clickOnRegisterButton() {

		wait.until(ExpectedConditions.elementToBeClickable(By.id("submitAccount"))).click();
		System.out.println("Details Registered in Application");
		return new ProfilePage();
	}
}
