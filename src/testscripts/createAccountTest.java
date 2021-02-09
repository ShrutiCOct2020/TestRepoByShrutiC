package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.ProfilePage;
import pojo.pojoCreateAccountDetails;

public class createAccountTest {

	WebDriver driver;

	@BeforeMethod
	public void setupMethod(){
		System.out.println("Step - Start browser and navigate to 'automationpractice.com' ");
		PredefinedActions.start("http://automationpractice.com/index.php");
	}
	
	@Test
	static public void automationPracticeLogin() {

		HomePage homePage = new HomePage();

		AuthenticationPage authenticationPage = homePage.clickOnSignInButton();
		authenticationPage.enterEmailId("shrutichavan26@gmail.com");

		System.out.println("Step - Navigate to create account page");
		CreateAccountPage createAccountPage = authenticationPage.clickOnCreateAccount();

		pojoCreateAccountDetails pojoCreateAccountDetails = new pojoCreateAccountDetails();
		pojoCreateAccountDetails.setGender("Male");
		pojoCreateAccountDetails.setFirstName("Shruti");
		pojoCreateAccountDetails.setLastName("Shruti");
		pojoCreateAccountDetails.setPassword("automation");
		pojoCreateAccountDetails.setDays("12");
		pojoCreateAccountDetails.setMonth("2");
		pojoCreateAccountDetails.setYear("1997");
		pojoCreateAccountDetails.setCompany("ABC");
		pojoCreateAccountDetails.setAddress("650 Grassere Park");
		pojoCreateAccountDetails.setCity("nashville");
		pojoCreateAccountDetails.setState("Tennessee");
		pojoCreateAccountDetails.setPostcode("37211");
		pojoCreateAccountDetails.setOther("NA");
		pojoCreateAccountDetails.setPhone("8905714840");
		pojoCreateAccountDetails.setMobileNum("8905714840");
		
		createAccountPage.enterYourDetails(pojoCreateAccountDetails);

		ProfilePage profilePage = createAccountPage.clickOnRegisterButton();

		String expectedHeader = "Shruti Chavan"; // combination of first and
													// last name
		Assert.assertEquals(profilePage.getPageHeader(), expectedHeader, "Verification of header failed");

	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("Close browser current window");
		driver.close();
	}
}
