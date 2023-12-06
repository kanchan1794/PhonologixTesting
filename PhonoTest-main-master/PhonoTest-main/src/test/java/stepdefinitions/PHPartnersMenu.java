package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLeadMenuPage;
import pageobjectclasses.PHPartnersMenuPage;

public class PHPartnersMenu extends PHBrowserConfig {


    PHPartnersMenuPage ObjPHPMBPage = new PHPartnersMenuPage(driverThread.get());

    @When("Admin clicks on Partners menu")
    public void adminClicksOnPartnersMenu() {
        ObjPHPMBPage.ViewPartnerMenu();
        System.out.println("ADMIN CAN CLICK ON PARTNERS MENU");
    }

    @Then("Admin can see partners List and Add Submenu")
    public void adminCanSeePartnersListAndAddSubmenu() {
     System.out.println("ADMIN CAN SEE PARTNERS LIST AND ADD SUBMENU ");

    }

    @When("Admin clicks on Partners List submenu")
    public void adminClicksOnPartnersListSubmenu() {
        ObjPHPMBPage.ClickPartnerListSubMenu();
        System.out.println("ADMIN CAN CLICK ON PARTNERS LIST SUBMENU ");


    }

    @Then("Admin can see The details of list of Partners")
    public void adminCanSeeTheDetailsOfListOfPartners() {
        System.out.println("ADMIN CAN SEE THE PARTNERS LIST DETAILS ");


    }


    @And("Admin can scroll vertically inside the Partners list table")
    public void adminCanScrollVerticallyInsideThePartnersListTable() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnersListScrollVertical();
        System.out.println("ADMIN CAN SCROLL VERTICALLY-INSIDE THE PARTNER LIST TABLE ");

    }

    @And("Admin can scroll horizantally inside the Partners list table")
    public void adminCanScrollHorizantallyInsideThePartnersListTable() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnerListScrollHorizantal();
        System.out.println("RELEVANT PARTNERS RESULT GENERATED ");

    }
    @When("Admin Enters Search Keywords for to see partners record")
    public void adminEntersSearchKeywordsForToSeePartnersRecord() throws InterruptedException {

        ObjPHPMBPage.SearchPartnersRecord();
        System.out.println("ADMIN CAN PASS KEYWORD TO SEARCH THE PARTNERS RECORD ");

    }

    @Then("Relevant partners Search Results Generated")
    public void relevantPartnersSearchResultsGenerated() throws InterruptedException {
        ObjPHPMBPage.ValidatepartnersListPage();


        System.out.println("RELEVANT PARTNERS RESULT GENERATED ");

    }


    @When("Admin clicks on Partners perticular page breadcrumbs")
    public void adminClicksOnPartnersPerticularPageBreadcrumbs() throws InterruptedException {
        ObjPHPMBPage.ClickOnPartnersPageBreadCrumbs();
        System.out.println("ADMIN CLICKS ON PARTNERS PAGE BREAD CRUMBS  ");


    }

    @Then("admin can see the Partners data on perticular page")
    public void adminCanSeeThePartnersDataOnPerticularPage() throws InterruptedException {
        ObjPHPMBPage.ValidatePartnersPageBreadCrumbsPage();
        System.out.println("ADMIN CAN SEE PARTNERS DATA ON PERTICULAR PAGE BREAD CRUMBS  ");


    }

    @And("Admin can navigate to previous partners page")
    public void adminCanNavigateToPreviousPartnersPage() throws InterruptedException {
        ObjPHPMBPage.navigatepartnersPreviousPage();
        System.out.println("ADMIN CAN NAVIGATE TO PARTNERS PREVIOUS PAGE ");


    }

    @When("Admin Clicks On Key Icon To View Partners Credentials")
    public void adminClicksOnKeyIconToViewPartnersCredentials() throws InterruptedException {
        ObjPHPMBPage.ClickToViewPartnersCredentials();
        System.out.println("ADMIN CAN CLICKS ON VIEW PARTNERS CREDENTIALS ICON");
        
    }

    @Then("Admin Can Copy Partners Credentials")
    public void adminCanCopyPartnersCredentials() throws InterruptedException {
        ObjPHPMBPage.CopyPartnersCredentials();
        System.out.println("ADMIN CAN COPY PARTNERS CREDENTIALS ");
        
    }

    @And("Admin Can verify Partners Credentials AlertBox")
    public void adminCanVerifyPartnersCredentialsAlertBox() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnersCredentialsAlertBox();
        System.out.println("ADMIN CAN verify PARTNERS CREDENTIALS ALERTBOX ");

    }
}
