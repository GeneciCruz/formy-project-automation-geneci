package implicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		// 1. Set the property for the webdriver.chromedriver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// 2. Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		// 3. Use the driver object to visit the google website
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		// 4. Find an element by name
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		// 5. Send key address
		autocomplete.sendKeys("Cornarona, County Galway, H91 T9NH, Ireland");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Find the selector for the exactly address wanted
		WebElement  autocompleteResult = driver.findElement(By.className("pac-item"));
		autocompleteResult.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	
	}

}
