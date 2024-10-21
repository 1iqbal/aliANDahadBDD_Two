package tek.bdd.steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;
import java.util.Map;

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
	public void user_enter_below_information(DataTable dataTable) {
		List<Map<String, String>> tableInfo = dataTable.asMaps(String.class, String.class);
clearTextUsingSendKeys(factory.accountPage().accountProfilePreviousPass);
clearTextUsingSendKeys(factory.accountPage().accountProfileNewPassword);
clearTextUsingSendKeys(factory.accountPage().accountProfileConfirmPassword);
sendText(factory.accountPage().accountProfilePreviousPass, DataGenUtility.data("password"));
sendText(factory.accountPage().accountProfileNewPassword, DataGenUtility.data("password"));
sendText(factory.accountPage().accountProfileConfirmPassword, DataGenUtility.data("confirmPassword"));
	}
	@When("User click on Change Password button")
	public void user_click_on_change_password_button() {
	click(factory.accountPage().accountProfileChangePasswordBtn);
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void a_message_should_be_displayed_password_updated_successfully() {
    Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordChangedWrangMessage));
	}


	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	click(factory.accountPage().addApaymentMethodLinkBtn);
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) throws InterruptedException {
List<Map<String, String>> tableInfo = dataTable.asMaps(String.class, String.class);

sendText(factory.accountPage().cardNumber, DataGenUtility.data(tableInfo.get(0).get("cardNumber")));
sendText(factory.accountPage().nameOnCard, DataGenUtility.data(tableInfo.get(0).get("nameOnCard")));
//		clearTextUsingSendKeys(factory.accountPage().expirationDateMonth);
//		clearTextUsingSendKeys(factory.accountPage().expirationDateYear);
		selectByVisibleText(factory.accountPage().expirationDateYear, DataGenUtility.data(tableInfo.get(0).get("expirationYear")));
        selectByVisibleText(factory.accountPage().expirationDateMonth, DataGenUtility.data(tableInfo.get(0).get("expirationMonth")));

sendText(factory.accountPage().securityCode, DataGenUtility.data(tableInfo.get(0).get("securityCode")));
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardBtn);
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messagePaymentMethodAddedSucessfully));
	}




	@When("User click on Edit option of card section")
	public void user_click_on_edit_option_of_card_section() {
		click(factory.accountPage().firstCart);
		click(factory.accountPage().cardEditBtn);
	}
	@When("user edit information with below data")
	public void user_edit_information_with_below_data(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> tableInfo = dataTable.asLists(String.class);
	clearTextUsingSendKeys(factory.accountPage().cardNumber);
	sendText(factory.accountPage().cardNumber, DataGenUtility.data(tableInfo.get(0).get(0)));
	clearTextUsingSendKeys(factory.accountPage().nameOnCard);
	sendText(factory.accountPage().nameOnCard, DataGenUtility.data(tableInfo.get(0).get(1)));

	selectByVisibleText(factory.accountPage().expirationDateYear, DataGenUtility.data(tableInfo.get(0).get(2)));
	selectByVisibleText(factory.accountPage().expirationDateMonth, DataGenUtility.data(tableInfo.get(0).get(3)));

	clearTextUsingSendKeys(factory.accountPage().securityCode);
	sendText(factory.accountPage().securityCode, DataGenUtility.data(tableInfo.get(0).get(4)));
	}
	@When("user click on Update Your Card button")
	public void user_click_on_update_your_card_button() {
		click(factory.accountPage().updateYourCardBtn);
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void a_message_should_be_displayed_payment_method_updated_successfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messagePaymentUpdateSucessfuly));
	}


	@When("User click on remove option of card section")
	public void user_click_on_remove_option_of_card_section() {
		click(factory.accountPage().masterCart);
		click(factory.accountPage().cardRemoveBtn);
	}
	@Then("payment details should be removed")
	public void payment_details_should_be_removed() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addApaymentMethodLinkBtn));
	}



	@When("User click on Add address option")
	public void user_click_on_add_address_option() {
		click(factory.accountPage().addAddressLinkBtn);
	}
	@When("user fill new address form with below information")
	public void user_fill_new_address_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String >> tableInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().newAddressCountryDropDown, DataGenUtility.data(tableInfo.get(0).get("country")));
		sendText(factory.accountPage().newAddressFullName, DataGenUtility.data(tableInfo.get(0).get("fullName")));
		sendText(factory.accountPage().newAddressPhoneNumber, DataGenUtility.data(tableInfo.get(0).get("phoneNumber")));
		sendText(factory.accountPage().newAddressAddress, DataGenUtility.data(tableInfo.get(0).get("streetAddress")));
		sendText(factory.accountPage().newAddressApt, DataGenUtility.data(tableInfo.get(0).get("apt")));
		sendText(factory.accountPage().newAddressCity, DataGenUtility.data(tableInfo.get(0).get("city")));
		selectByVisibleText(factory.accountPage().newAddressState, DataGenUtility.data(tableInfo.get(0).get("state")));
		sendText(factory.accountPage().newAddressZipCode, DataGenUtility.data(tableInfo.get(0).get("zipCode")));
	}
	@When("User click Add Your Address button")
	public void user_click_add_your_address_button() {
		click(factory.accountPage().addYourAddressBtn);
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void a_message_should_be_displayed_address_added_successfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageAddressAddedSucessfully));
	}


	@When("User click on edit address option")
	public void user_click_on_edit_address_option() {
		click(factory.accountPage().addressEditBtn);
	}
	@When("User click update Your Address button")
	public void user_click_update_your_address_button() {
		click(factory.accountPage().updateYourAddress);
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void a_message_should_be_displayed_address_updated_successfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageAddressUpdateSuccesfully));
	}

	@When("User click on remove option of Address section")
	public void user_click_on_remove_option_of_address_section() {
		click(factory.accountPage().addressRemoveBtn);
	}
	@Then("Address details should be removed")
	public void address_details_should_be_removed() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addAddressLinkBtn));
	}


}