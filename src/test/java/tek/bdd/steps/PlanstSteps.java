package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;
import org.testng.asserts.SoftAssert;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class PlanstSteps extends SeleniumUtility {
POMFactory factory = new POMFactory();

	@Then("User click on Plans button")
	public void user_click_on_plans_button() {
		click(factory.homePage().planButton);
	}
	@Then("User should {int} rows of Data are present")
	public void user_should_rows_of_data_are_present(Integer int1) {

		List<WebElement> tableRow = getElements(factory.plansPage().rowsOfthePlansData);
	    Assert.assertEquals(tableRow.size(), 4);
	    logger.info(tableRow.size()+" four rows of plan page present");
	}

	
	
	@Then("User should verify create date is today date")
	public void user_should_verify_create_date_is_today_s_date() {
		SoftAssert softAssert = new SoftAssert();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		softAssert.assertEquals(getText(factory.plansPage().dateCreated), dtf.format(LocalDate.now()));
	}

	@Then("User should verify expire date is the day after today")
	public void user_should_verify_expire_date_is_the_day_after_today() {
		SoftAssert softAssert = new SoftAssert();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		softAssert.assertEquals(getText(factory.plansPage().dateExpire), dtf.format(LocalDate.now().plusDays(1)));
	}




}
