package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tek.bdd.page.POMFactory;
import tek.bdd.utility.DataGenUtility;
import tek.bdd.utility.SeleniumUtility;

public class AccountSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();

	@Then("User click on Accounts button")
	public void user_click_on_plsns_button() {
		click(factory.homePage().accountButton);
	}

	@Then("User should Verify {int} rows are present")
	public void user_should_verify_rows_are_present(Integer int1) {
		List<WebElement> itemsRow = getElements(factory.accountPage().accountTableRows);
		Assert.assertEquals(itemsRow.size(), 5);
		logger.info(factory.accountPage().accountTableRows.size() + " are equal to 5 Rows");
	}

	@Then("User click on  Show button drop down")
	public void user_click_on_show_button_drop_down() {
		click(factory.accountPage().accountShowBarDropDown);
	}

	@Then("User select {int} from drop down")
	public void user_select_from_drop_down(Integer int1) {
		selectByVisibleText(factory.accountPage().accountShowBarDropDown, "Show 10");
	}

	@Then("User should verify {int} rows of Primary Accounts are present")
	public void user_should_verify_rows_of_primary_accounts_are_present(Integer int1) {
		List<WebElement> items10 = getElements(factory.accountPage().accoutTableRows10);
		Assert.assertEquals(items10.size(), 10);
		logger.info(items10 + " are equal to 10 Rows");

	}

	@Then("User click on  Show button drop down2")
	public void user_click_on_show_button_drop_down2() {
		click(factory.accountPage().accountShowBarDropDown);
	}

	@Then("User select {int} from drop down2")
	public void user_select_from_drop_down2(Integer int1) {
		selectByVisibleText(factory.accountPage().accountShowBarDropDown, "Show 25");
	}

	@Then("User should verify {int} rows of Primary Accounts are present2")
	public void user_should_verify_rows_of_primary_accounts_are_present2(Integer int1) {
		List<WebElement> items25 = getElements(factory.accountPage().accountTableRows25);
		Assert.assertEquals(items25.size(), 25);
		logger.info(items25 + " are equal to 25 Rows");
	}

	@Then("User click on  Show button drop down3")
	public void user_click_on_show_button_drop_down3() {
		click(factory.accountPage().accountShowBarDropDown);
	}

	@Then("User select {int} from drop down3")
	public void user_select_from_drop_down3(Integer int1) {
		selectByVisibleText(factory.accountPage().accountShowBarDropDown, "Show 50");
	}

	@Then("User should verify {int} rows of Primary Accounts are present3")
	public void user_should_verify_rows_of_primary_accounts_are_present3(Integer int1) {
		List<WebElement> items50 = getElements(factory.accountPage().accountTableRows50);
		Assert.assertEquals(items50.size(), 50);
		logger.info(items50 + " are equal to 50 Rows");
	}

}