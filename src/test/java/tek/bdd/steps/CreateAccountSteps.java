package tek.bdd.steps;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import net.datafaker.Faker;

import org.junit.Assert;

import tek.bdd.page.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;


public class CreateAccountSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();

	Faker faker = new Faker();
	
	String userNameFaker = faker.expression("#{letterify '????.ali'}");
	//String user1 = outPut;
	//String user2 = outPut;

	@When("User click on create primary account button")
	public void user_click_on_create_primary_account_button() {
		click(factory.homePage().createPrimaryAccountBtn);
	}

	@Then("User enter {string} in First Name field")
	public void user_enter_in_first_name_field(String firstName) {
		sendText(factory.createAccountPage().firstNameInput, firstName);
	}

	@Then("User enter {string} in Last Name field")
	public void user_enter_in_last_name_field(String lastName) {
		sendText(factory.createAccountPage().lastNameInput, lastName);
	}

	@Then("User enter {string} in EmploymentStatus field")
	public void user_enter_in_employment_status_field(String employmentstatus) {
		sendText(factory.createAccountPage().employmentStatus, employmentstatus);
	}

	@Then("User should select Mr. in Title drop down")
	public void user_should_select_mr_in_title_drop_down() {
		selectByVisibleText(factory.createAccountPage().titleDropDown, "Mr.");
	}

	@Then("User should select Male in Gender drop down")
	public void user_should_select_male_in_gender_drop_down() {
		selectByVisibleText(factory.createAccountPage().genderDropDown, "Male");
	}

	@Then("User should select Married in Marital Status drop down")
	public void user_should_select_married_in_marital_status_drop_down() {
		selectByVisibleText(factory.createAccountPage().maritalStatusDropDown, "Married");
	}

	
	
	
	
	
	@Then("User enter {string} in Email field")
	public void user_enter_in_email_field(String email) {
		sendText(factory.createAccountPage().emailInput, DataGenUtility.data("email"));
	}
	@Then("User should send {string} in Date of Birth drop down")
	public void user_should_send_in_date_of_birth_drop_down(String date) {
		sendDateToInput(factory.createAccountPage().dateOfBirth, date);
	}
	@Then("User click on Create Account button")
	public void user_click_on_create_account_button() {
		click(factory.createAccountPage().createAccountBtn);
	}
	@Then("User should Verify is email text is shown as expected")
	public void user_should_verify_is_email_text_is_shown_as_expected() {
		Assert.assertTrue(isElementDisplayed(factory.createAccountPage().emailTextOnSignUpAc));
		logger.info("[ " + isElementDisplayed(factory.createAccountPage().emailTextOnSignUpAc)
				+ " [Email Text is present on SigUp Page]");
	}

	
	
	
	@Then("User enter {string} in Email field2")
	public void user_enter_in_email_field2(String existEmail) {
		sendText(factory.createAccountPage().emailInput, existEmail);
	}
	@Then("User should send {string} in Date of Birth drop down2")
	public void user_should_send_in_date_of_birth_drop_down2(String date) {
		sendDateToInput(factory.createAccountPage().dateOfBirth, date);
	}
//	@Then("User click on Create Account button")
//	public void user_click_on_create_account_button() {
//		click(factory.createAccountPage().createAccountBtn);
//	}
	@Then("User should Verify is error of existing email")
	public void user_should_verify_is_error_of_existing_email() {
		Assert.assertTrue(isElementDisplayed(factory.createAccountPage().emailExistError));
		logger.info("[ " + isElementDisplayed(factory.createAccountPage().emailExistError)
				+ " [Email Existing Error is present on SigUp Page]");
	}

	
	
	
	
	@Then("User enter {string} in Email young Age")
	public void user_enter_in_email_field3(String string) {
		sendText(factory.createAccountPage().emailInput, DataGenUtility.data("email"));
	}
	@Then("User should send {string} in Date of Birth drop down3")
	public void user_should_send_in_date_of_birth_drop_down3(String dateYoun) {
		sendDateToInput(factory.createAccountPage().dateOfBirth, dateYoun);
	}

//	@Then("User click on Create Account button")
//	public void user_click_on_create_account_button() {
//		click(factory.createAccountPage().createAccountBtn);
//
//	}
	@Then("User should Verify is error of younger Age")
	public void user_should_verify_is_error_of_younger_age() {
		Assert.assertTrue(isElementDisplayed(factory.createAccountPage().ageError));
		logger.info("[ " + isElementDisplayed(factory.createAccountPage().ageError)
				+ " [User is Young Error is present on SigUp Page]");
	}

	
	
	@Then("User enter {string} in Email valid")
	public void user_enter_in_email_field4(String string) {
		sendText(factory.createAccountPage().emailInput, DataGenUtility.data("email"));
	}
	@Then("User should send {string} in Date of Birth drop down4")
	public void user_should_send_in_date_of_birth_drop_down4(String dOFb) {
		sendDateToInput(factory.createAccountPage().dateOfBirth, dOFb);
	}
//	@Then("User click on Create Account button")
//	public void user_click_on_create_account_button() {
//		click(factory.createAccountPage().createAccountBtn);
//	}

	
	
	@Then("User enter {string} in userName field5")
	public void User_enter_in_userName_field(String userName) throws InterruptedException {
		sendText(factory.createAccountPage().userNameInput, userNameFaker);
		Thread.sleep(4000);
	}
	@Then("User enter {string} in Password field5")
	public void User_enter_in_Password_field(String password) {
		sendText(factory.createAccountPage().passwordInput, "Ali112233!");
	}
	@Then("User enter {string} in confirmPassword field5")
	public void User_enter_in_confirmePassword_field(String confirmpassword) {
		sendText(factory.createAccountPage().confirmPasswordPage, "Ali112233!");
	}
	@Then("User click on submit button")
	public void User_click_on_Login_button() throws InterruptedException {
		click(factory.createAccountPage().submitBtn);
		Thread.sleep(4000);
	}

	
	
	@Then("User enter {string} userName")
	public void User_enter_userName(String user) throws InterruptedException {
		sendText(factory.createAccountPage().userNameOfSignIn, userNameFaker);
		Thread.sleep(4000);
	}
	@Then("User enter {string} password")
	public void User_enter_password(String password) {
		sendText(factory.createAccountPage().passwordSignIn, "Ali112233!");
	}

	
	
	@Then("User click on signInBtn")
	public void User_click_on_signInBtn() throws InterruptedException {
		click(factory.createAccountPage().signInBtnOfSignIn);
		
		Thread.sleep(3000);
	}
	

	@Then("User click on profile Icon button")
	public void user_click_on_profile_icon_button() {
		click(factory.userProfilePage().profileIcon);
	}

	@Then("User should verify FullName is present")
	public void user_should_verify_full_name_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.userProfilePage().profileFullName));
		logger.info("[ " + isElementDisplayed(factory.userProfilePage().profileFullName)
				+ " [User FullName is present on User profile]");

	}

}
