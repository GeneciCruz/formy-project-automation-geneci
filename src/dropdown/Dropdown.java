package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// Set the driver property
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// New instance of the driver
		WebDriver driver = new ChromeDriver();
		// State the page to be tested
		driver.get("https://formy-project.herokuapp.com/dropdown");

		// Find element by ID
		WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.click();
		
		Thread.sleep(3000);	
		//Close browser
		driver.quit();
		
	}

}
