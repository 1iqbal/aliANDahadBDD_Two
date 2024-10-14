package tek.bdd.steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;

public class AccountSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();
	@When("User click on Account option")
	public void user_click_on_account_option() {

		click(factory.accountPage().accountBtnLink);
	}
	@When("User update Name ‘NameValue’ and Phone ‘PhoneValue’")
	public void user_update_name_name_value_and_phone_phone_value() {
		clearTextUsingSendKeys(factory.accountPage().accountProfileNameInput);
		clearTextUsingSendKeys(factory.accountPage().accountProfilePhoneNumberInput);
	sendText(factory.accountPage().accountProfileNameInput, DataGenUtility.data("name"));
	sendText(factory.accountPage().accountProfilePhoneNumberInput, DataGenUtility.data("phoneNumber"));

	}
	@When("User click on Update button")
	public void user_click_on_update_button() {
	click(factory.accountPage().accountProfileUpdateBtn);
	}
	@Then("user profile information should be updated")
	public void user_profile_information_should_be_updated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfileName));
	}


	
	@When("User enter below information")
	public void user_enter_below_information(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}
	@When("User click on Change Password button")
	public void user_click_on_change_password_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void a_message_should_be_displayed_password_updated_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}



}