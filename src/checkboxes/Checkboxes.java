package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		//Set the driver property
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//New instance of the driver
		WebDriver driver = new ChromeDriver();
		//State the page to be tested
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		//Find element by ID
		WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
		checkbox1.click();
		
		//Find element by value
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		checkbox2.click();
		
		//Find element by id
		WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
		checkbox3.click();
		Thread.sleep(3000);	
		//Close browser
		driver.quit();

	}
}
