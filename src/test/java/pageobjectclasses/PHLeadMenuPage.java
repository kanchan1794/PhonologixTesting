package pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHLeadMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHLeadMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewLeadMenu() {

        WebElement LeadMenu_Link = driver.findElement(By.linkText("Leads"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Leads")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadMenu_Link);




    }

}