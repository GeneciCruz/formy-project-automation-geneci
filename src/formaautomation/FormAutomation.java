package formaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAutomation {

	public static void main(String[] args) {
		// 1. Set the property for the webdriver.chromedriver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// 2. Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		// 3. Use the driver object to visit the google website
		driver.get("https://formy-project.herokuapp.com/form");
		
		//First Name
		driver.findElement(By.id("first-name")).sendKeys("Geneci");
		//Last Name
		driver.findElement(By.id("last-name")).sendKeys("Ui Fhatharta");
		//Role
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		//Education
		driver.findElement(By.id("radio-button-2")).click();		
		//Gender
		driver.findElement(By.id("checkbox-2")).click();
		//Experience
		driver.findElement(By.id("select-menu")).click();		
		driver.findElement(By.cssSelector("option[value='1']")).click();
		//Set Date
		driver.findElement(By.id("datepicker")).sendKeys("10/06/2021");		
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		//Submit		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//driver.quit();

	}

}
