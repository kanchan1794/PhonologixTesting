package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/featurefiles"},
        glue = {"stepdefinitions"},
        plugin = {"json:target/cucumber.json"},
		//tags = "@Login or @PartnersMenu"
        tags ="@Login or @PartnersMenu or @PartnersListSubMenu or   @PartnerPageBreadCrumbs or @PartnersShowCredentials"


		//or @TherapistListSubMenu or @TherapistExcelFileDownload or @PageBreadCrumbs or @TherapistListTableScrollDown or @TherapistShowCredentials or @TherapistViewDetails or
// or @TherapistAddSubMenu  or @Dashboard


)

public class TestRunner {


}
