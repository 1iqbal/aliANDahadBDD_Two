package tek.bdd.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Sign In Link")
	public void user_click_on_sign_in_link() {
		click(factory.loginPage().loginBtn);
	}

	@Then("User enter {string} in userName field")
	public void user_enter_in_email_field(String userName) {
		sendText(factory.loginPage().userNameInput, "supervisor");
	}

	@Then("User enter {string} in Password field")
	public void user_enter_in_password_field(String password) {
		sendText(factory.loginPage().passwordIpt, "tek_supervisor" );
	}

	@Then("User click on Login button")
	public void user_click_on_login_button() {
		click(factory.loginPage().signInBtn);
	}

	@Then("User should Validate he navigate to Customer Service Portal")
	public void user_should_validate_he_navigate_to_customer_service_portal() {
		Assert.assertTrue(isElementDisplayed(factory.userProfilePage().customerServicePortal));
	}

	
	
	
	@Then("User enter invalid {string} in field")
	public void user_enter_invalid_in_field(String inValUserName) {
		sendText(factory.loginPage().userNameInput, "supervisor1");
	}
	@Then("User enter valid {string} in Password field")
	public void user_enter_valid_in_password_field(String passw) {
		sendText(factory.loginPage().passwordIpt, "tek_supervisor");
	}
//
//	@Then("User click on Login btn")
//	public void user_click_on_login_button2() {
//		click(factory.loginPage().signInBtn);
//	}

	@Then("User should validate wrong username entered message")
	public void user_should_validate_wrong_username_entered_message() throws InterruptedException {
		Assert.assertTrue(isElementDisplayed(factory.loginPage().userErrorMessage));
		logger.info(isElementDisplayed(factory.loginPage().userErrorMessage) + " User Error Message Displayed");
		Thread.sleep(4000);
		clearTextUsingSendKeys(factory.loginPage().userNameInput);
		clearTextUsingSendKeys(factory.loginPage().passwordIpt);
	}

	@Then("User enter valid {string} in Email field")
	public void user_enter_valid_in_email_field(String string) {
		sendText(factory.loginPage().userNameInput, "supervisor");
	}

	@Then("User enter invalid {string} in Password field")
	public void user_enter_invalid_in_password_field(String string) {
		sendText(factory.loginPage().passwordIpt, "tek_supervisor1");
	}

//	@Then("User click on Login btn2")
//	public void user_click_on_login_button3() {
//		click(factory.loginPage().signInBtn);
//	}

	@Then("User should validate wrong password entered message")
	public void user_should_validate_wrong_password_entered_message() {
		Assert.assertTrue(isElementDisplayed(factory.loginPage().passwordErrorMessage));
		logger.info(
				isElementDisplayed(factory.loginPage().passwordErrorMessage) + " Password error message is verified");
	}

	@Then("User click on profile Icone button")
	public void user_click_on_profile_icone_button() {
		click(factory.userProfilePage().profileIcon);
	}

	@Then("User click on Logout button")
	public void user_click_on_logout_button() {
		click(factory.userProfilePage().userProfileLogoutBtn);
	}

	@Then("User should Validate Home page is present")
	public void user_should_validate_home_page_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().homePageMainTitle));
        logger.info(isElementDisplayed(factory.homePage().homePageMainTitle)+" Main Title of Home page is Present");
	}

}
