package tek.bdd.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;

public class HomeSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();

	@When("Validate Home page Title TEK Insurance UI is present")
	public void validate_home_page_title_tek_insurance_ui_is_present() {
		String actualTitle = getTitle();
		String expectedTitle = "Tek Insurance UI";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekInsuracePageName));
		logger.info("Actual Title " + actualTitle + " Ecpected Title " + expectedTitle);
	}

	@When("Create Primary Account button is Exist")
	public void create_primary_account_button_is_exist() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().createPrimaryAccountBtn));
	logger.info(isElementDisplayed(factory.homePage().createPrimaryAccountBtn)+" Create Primary Account is Present");
	}

	@When("User click on on Create Primary Account button")
	public void user_click_on_on_create_primary_account_button() {
		click(factory.homePage().createPrimaryAccountBtn);
	}

	@Then("User should Validate Title form Create Primary Account Holder is present")
	public void user_should_validate_title_form_create_primary_account_holder_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.createAccountPage().creatAccountTitle));
	    logger.info("[[--> "+factory.createAccountPage().creatAccountTitle+ " [ IS PRESENT ]");
	}
}