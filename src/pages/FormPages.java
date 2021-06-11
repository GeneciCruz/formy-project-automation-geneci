package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPages {
	
	public void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Geneci Maria");
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
    }
	

}
