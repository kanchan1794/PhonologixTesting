package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLeadMenuPage;
import pageobjectclasses.PHTherapistMenuPage;

public class PHLeadMenu extends PHBrowserConfig {

    PHLeadMenuPage ObjPHLMBPage = new PHLeadMenuPage(driverThread.get());

    @When("Admin clicks on Lead menu")
    public void adminClicksOnLeadMenu() {
        ObjPHLMBPage.ViewLeadMenu();
        System.out.println("ADMIN CLICK ON LEADS MENU");
    }

    @Then("Admin can see Leads List Section")
    public void adminCanSeeLeadsListSection() {
    }
}
