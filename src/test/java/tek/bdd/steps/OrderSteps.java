package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.page.POMFactory;
import tek.bdd.utility.SeleniumUtility;

public class OrderSteps extends SeleniumUtility {
    private POMFactory factory = new POMFactory();

    @When("User click on Orders section")
    public void user_click_on_orders_section() {
        click(factory.homePage().orderBtn);
    }
    @When("User click on first order in list")
    public void user_click_on_first_order_in_list() {
        click(factory.orderPage().showDetails);
    }
    @When("User click on Cancel The Order button")
    public void user_click_on_cancel_the_order_button() {
        click(factory.orderPage().cancelTheOrderBtn);
    }
    @When("User select the cancellation Reason ‘Bought wrong item’")
    public void user_select_the_cancellation_reason_bought_wrong_item() {
        selectByVisibleText(factory.orderPage().cancelationReason,"Bought wrong item");
    }
    @When("User click on Cancel Order button")
    public void user_click_on_cancel_order_button() {
        click(factory.orderPage().cancelSubmitBtn);
    }
    @Then("a cancellation message should be displayed {string}")
    public void a_cancellation_message_should_be_displayed_your_order_has_been_cancelled(String input) {
        Assert.assertTrue(isElementDisplayed(factory.orderPage().messageYourOrderCancelled));

    }
    @When("User click on Return Items button")
    public void user_click_on_return_items_button() {
       click(factory.orderPage().returnOrderBtn);
    }
    @When("User select the Return Reason ‘Item damaged’")
    public void user_select_the_return_reason_item_damaged() {
        selectByVisibleText(factory.orderPage().cancelationReason, "Item damaged");
    }
    @When("User select the drop off service ‘FedEx’")
    public void user_select_the_drop_off_service_fed_ex() {
        selectByVisibleText(factory.orderPage().whereToDropOff, "FedEx");
    }
    @When("User click on Return Order button")
    public void user_click_on_return_order_button() {
        click(factory.orderPage().returnOrderSubmitBtn);
    }
    @Then("a cancellation message should be displayed ‘Return was successful’")
    public void a_cancellation_message_should_be_displayed_return_was_successful() {
        Assert.assertTrue(isElementDisplayed(factory.orderPage().messageReturnWasSuccessfull));
    }

    @When("User click on Review button")
    public void user_click_on_review_button() {
        click(factory.orderPage().reviewBtn);
    }
    @When("User write Review headline {string} and {string}")
    public void user_write_review_headline_headline_value_and_review_text(String input1, String input2) {
        sendText(factory.orderPage().headlineInput,input1);
        sendText(factory.orderPage().writtenInput,input2);
    }
    @When("User click Add your Review button")
    public void user_click_add_your_review_button() {
        click(factory.orderPage().addYourReview);
    }
    @Then("a review message should be displayed ‘Your review was added successfully’")
    public void a_review_message_should_be_displayed_your_review_was_added_successfully() {
        Assert.assertTrue(isElementDisplayed(factory.orderPage().messageYourReviewWasAdded));
    }
    @When("User click on buy Again")
        public void user_click_On_buy_again(){
            click(factory.orderPage().buyAgainOrderBtn);
        }
    }

