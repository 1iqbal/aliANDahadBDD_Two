package tek.bdd.steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;

public class HomeSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String atualTitle = getTitle();
		String expectedTitle = "React App";

		Assert.assertEquals(atualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().homePageTitle));

	}
	}