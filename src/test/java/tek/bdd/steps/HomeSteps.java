package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class HomeSteps extends SeleniumUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String atualTitle = getTitle();
		String expectedTitle = "React App";

		Assert.assertEquals(atualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().homePageTitle));
	}
		@When("User click on All section")
		public void user_click_on_all_section() {
			click(factory.homePage().All);
		}
		@Then("below options are present in Shop by Department sidebar")
		public void below_options_are_present_in_shop_by_department_sidebar(DataTable dataTable) {
			List<List<String>> actual = dataTable.asLists(String.class);

			List<WebElement> expected = factory.homePage().allDepts;

			for (int i = 0; i < actual.get(0).size(); i++) {
				Assert.assertEquals(actual.get(0).get(i), expected.get(i).getText());
				logger.info(expected.get(i).getText() + " IS equal to " + actual.get(0).get(i));
			}

//			Assert.assertEquals(actual.get(0).get(0), factory.homePage().electronics.getText());
//			Assert.assertEquals(actual.get(0).get(1), factory.homePage().computers.getText());
//			Assert.assertEquals(actual.get(0).get(2), factory.homePage().smartHome.getText());
//			Assert.assertEquals(actual.get(0).get(3), factory.homePage().sports.getText());
//			Assert.assertEquals(actual.get(0).get(4), factory.homePage().automative.getText());


		}
			@When("User on {string}")
			public void user_on(String department) {
				List<WebElement> sideBar = factory.homePage().allDepts;
				for(WebElement options : sideBar){
					if(options.getText().equals("department")){
						click(options);
						try {
							logger.info(options.getText()+" is present ");
						}catch (StaleElementReferenceException e){

						}
						break;
					}

				}

			}
			@Then("below options are present in department")
			public void below_options_are_present_in_department(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> expectedDeps = dataTable.asLists(String.class);
		List<WebElement> actualDeps = factory.homePage().allDepts;

		for(int i=0; i<expectedDeps.get(0).size(); i++){
			for(WebElement dept : actualDeps){

				if(dept.getText().equals(expectedDeps.get(0).get(i))){

					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}
		}
	}

	@Then("User change the category to {string}")
	public void user_change_the_category_to(String SmartHome) {
		click(factory.homePage().allDepartmentsBtn);
		selectByVisibleText(factory.homePage().allDepartmentsBtn, SmartHome);
	}
	@Then("User search for an item {string}")
	public void user_search_for_an_item(String input) throws InterruptedException {
		click(factory.homePage().homePageSearchInput);
		sendText(factory.homePage().homePageSearchInput, input);
		Thread.sleep(3000);
	}
	@Then("User click on Search icon")
	public void user_click_on_search_icon() {
		click(factory.homePage().homePageSearchBtn);
	}
	@Then("User click on item")
	public void user_click_on_item() {
		click(factory.homePage().kasaOutdoorSmartPlug);
	}
	@Then("User select quantity {string}")
	public void user_select_quantity(String num) {
		click(factory.homePage().qtyDropDown);
		selectByVisibleText(factory.homePage().qtyDropDown, num);
	}
	@Then("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		click(factory.homePage().addToCartBtn);
	}
	@Then("the cart icon quantity should change to {string}")
	public void the_cart_icon_quantity_should_change_to(String int1) {
		Assert.assertEquals(int1, factory.homePage().cartQty.getText());
	}
	@Then("User click on Cart option")
	public void user_click_on_cart_option() {
		click(factory.homePage().homePageCartBtn);
	}
	@Then("User click on Proceed to Checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		click(factory.homePage().proceedBtn);
	}
	@Then("User click Add a new address link for shipping address")
	public void user_click_add_a_new_address_link_for_shipping_address() {
		click(factory.homePage().homePageAddANewAddress);
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void user_click_add_a_credit_card_or_debit_card_for_payment_method() {
	click(factory.homePage().homePageAddANewPayment);
	}
	@Then("User click on Place Your Order")
	public void user_click_on_place_your_order() {
		click(factory.homePage().placeYourOrder);
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void a_message_should_be_displayed_order_placed_thanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanksText));
	}


	@Then("User change the category to electronics {string}")
	public void user_change_the_category_to_electronics(String input) {
		click(factory.homePage().allDepartmentsBtn);
		selectByVisibleText(factory.homePage().allDepartmentsBtn, input);
	}

	@Then("Users search for an item {string}")
	public void users_search_for_an_item(String input) {
		click(factory.homePage().homePageSearchInput);
		sendText(factory.homePage().homePageSearchInput, input);
	}

	@Then("User click on Apex Legends")
	public void user_click_on_apex_legends() {
		click(factory.homePage().apexLegends);
	}

	@Then("User select quantity five {string}")
	public void user_select_quantity_five(String input) {
		click(factory.homePage().qtyDropDown);
		selectByVisibleText(factory.homePage().qtyDropDown, input);
	}
	@Then("the cart icon quantity should change to five {string}")
	public void the_cart_icon_quantity_should_change_to_five(String input) {
		Assert.assertEquals(input, factory.homePage().cartQty.getText());
	}





}


