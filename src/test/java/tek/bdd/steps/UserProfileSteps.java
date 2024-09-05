package tek.bdd.steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {
POMFactory factory = new POMFactory();

	@Then("User should verify profile Title is present")
	public void user_should_verify_profile_title_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.userProfilePage().userProfieHeader));

	}

	@Then("User should verify main Title of home page is present")
	public void user_should_verify_main_title_of_home_page_is_present() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().homePageMainTitle));

	}







}
