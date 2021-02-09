package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {

	protected static WebDriver driver;
	
	public static WebDriver start(String url) {
		
		String driverPath="./resources/windows/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Navigate to Application");
		
		return driver;
	}
}
