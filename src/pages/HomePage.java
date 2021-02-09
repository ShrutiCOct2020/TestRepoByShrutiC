package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class HomePage extends PredefinedActions{
	
	public AuthenticationPage clickOnSignInButton(){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login"))).click();
		System.out.println("Clicked on Sign in successfully");

		return new AuthenticationPage();
	}

}
