package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
	// Set the driver property
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	// New instance of the driver
	WebDriver driver = new ChromeDriver();
	// State the page to be tested
	driver.get("https://formy-project.herokuapp.com/fileupload");

	// Find element by ID
	WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
	fileUploadField.sendKeys(".\\resources\\imageg.jpg");
	Thread.sleep(1000);	
	driver.quit();
	}
}
