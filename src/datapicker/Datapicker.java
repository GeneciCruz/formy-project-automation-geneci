package datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker {

	public static void main(String[] args) throws InterruptedException {
		// Set the driver property
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// New instance of the driver
		WebDriver driver = new ChromeDriver();
		// State the page to be tested
		driver.get("https://formy-project.herokuapp.com/datepicker");

		// Find element by ID
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("07/07/2021");
		datepicker.sendKeys(Keys.RETURN);
		Thread.sleep(3000);	
		//Close browser
		driver.quit();

	}

}
