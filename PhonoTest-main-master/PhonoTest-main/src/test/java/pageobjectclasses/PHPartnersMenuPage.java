package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHPartnersMenuPage extends PHBrowserConfig {

    private WebDriver driver = null;


    public PHPartnersMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewPartnerMenu() {

        WebElement PartnerMenu_Link = driver.findElement(By.linkText("Partners"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnerMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Partners")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnerMenu_Link);

    }

    public void ClickPartnerListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'/partners/list')]")));

        WebElement PartnerList_Link = driver.findElement(By.xpath("//*[contains(@href,'/partners/list')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnerList_Link);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'/partners/list')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnerList_Link);


    }

    public void SearchPartnersRecord() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement PartSearchRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        PartSearchRecord_List.sendKeys("08794476826");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='08794476826']")).clear();

        //PartSearchRecord_List.clear();
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartSearchRecord_List);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartSearchRecord_List);

    }

    public void ValidatepartnersListPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Partners List')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Partners List')]")).isDisplayed() + "**********");
    }

    public void VerifyPartnersListScrollVertical() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");

    }

    public void VerifyPartnerListScrollHorizantal() throws InterruptedException {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=500");


    }

    public void ClickOnPartnersPageBreadCrumbs() throws InterruptedException {
        Thread.sleep(2000);
        WebElement PartnersPageBreadCrumbs_Link = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnersPageBreadCrumbs_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'2')]")));


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnersPageBreadCrumbs_Link);

    }


    public void ValidatePartnersPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
//ScorllTop Of Page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")).isDisplayed() + "**********");


    }
    public void navigatepartnersPreviousPage() throws InterruptedException {
        Thread.sleep(4000);
//Scorll Bottom Of Page

//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement PartnersPrevious_Link = driver.findElement(By.xpath("//a[contains(text(),'Previous')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Previous')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnersPrevious_Link);

        //Scorll Top Of Page
       // ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }

    public void ClickToViewPartnersCredentials() throws InterruptedException {

        //Scorll Top Of Page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(2000);
        WebElement PartnersCredentials = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        js.executeScript("arguments[0].scrollIntoView();", PartnersCredentials);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/*[1]")));
        //PartnersCredentials = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/*[1]"));
        //js.executeScript("arguments[0].click();", PartnersCredentials);
        PartnersCredentials.click();

    }

    public void CopyPartnersCredentials() throws InterruptedException {
        Thread.sleep(2000);
        WebElement PartnersCredentials_Verify = driver.findElement(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistCredentials_Verify);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]")));
PartnersCredentials_Verify.click();

    }

    public void VerifyPartnersCredentialsAlertBox() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'third@partner.com')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//td[contains(text(),'third@partner.com')]")).isDisplayed() + "**********");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);

    }

}