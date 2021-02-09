package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class AuthenticationPage extends PredefinedActions {

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void enterEmailId(String emailID) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create"))).sendKeys(emailID);
		System.out.println("Entered the email address - " + emailID);
	}

	public CreateAccountPage clickOnCreateAccount() {

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#SubmitCreate"))).click();
		System.out.println("Clicked on Create Account button");
		return new CreateAccountPage();
	}

}
