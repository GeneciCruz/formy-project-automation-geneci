package forms;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ConfirmationPage;
import pages.FormPages;

public class Form {
	public static void main(String[] args) throws InterruptedException {
        // 1. Set the property for the driver.chromedriver
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        
        FormPages formPage = new FormPages();
        formPage.submitForm(driver);
        ConfirmationPage confPage = new ConfirmationPage();
        confPage.waitForAlertBanner(driver);        
      
        Assert.assertEquals("The form was successfully submitted!", confPage.getAlertBannerText(driver));
        Thread.sleep(3000);
        driver.quit();
    }//main
    

}
