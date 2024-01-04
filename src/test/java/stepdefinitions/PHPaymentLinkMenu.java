package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHTransactionMenuPage;

public class PHPaymentLinkMenu {

    PHPaymentLinkMenuPage ObjPHPLMPage = new PHPaymentLinkMenuPage(driverThread.get());

    @When("Admin clicks on PaymentLink menu")
    public void adminClicksOnTransactionMenu() {
        ObjPHPLMPage.ViewPaymentLinkMenu();
        System.out.println("ADMIN CAN CLICK ON PaymentLink MENU");
    }

    @Then("Admin can see PaymentLink details")
    public void adminCanSeePaymentLinkDetails() {
        
    }

    @When("Admin clicks on PaymentLink-List submenu")
    public void adminClicksOnPaymentLinkListSubmenu() {
        
    }

    @Then("Admin can see The details of list of PaymentLinks")
    public void adminCanSeeTheDetailsOfListOfPaymentLinks() {
    }
}
