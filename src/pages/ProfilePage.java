package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.PredefinedActions;

public class ProfilePage extends PredefinedActions {

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public String getPageHeader() {

		String actualHeader = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header_user_info span")))
				.getText();
		
		
		return actualHeader;
	}

}
