package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		//Set the driver property
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//New instance of the driver
		WebDriver driver = new ChromeDriver();
		//State the page to be tested
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		//Find element by ID
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		
		//Find element by value
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radiobutton2.click();
		
		//Find element by xpath
		WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radiobutton3.click();
		

	}

}
