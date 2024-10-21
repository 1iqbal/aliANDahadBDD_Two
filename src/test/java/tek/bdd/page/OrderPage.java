package tek.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

public class OrderPage extends SeleniumUtility {
    public OrderPage(){
        PageFactory.initElements(getDriver(), this);}

    @FindBy(css = "#cancelBtn") public WebElement cancelTheOrderBtn;
    @FindBy(css = "#returnBtn") public WebElement returnOrderBtn;
    @FindBy(css = "#buyAgainBtn") public WebElement buyAgainOrderBtn;
    @FindBy(css = "#reviewBtn") public WebElement reviewBtn;
    @FindBy(xpath = "//p[text()='Hide Details']") public WebElement hideDetails;
    @FindBy(xpath = "(//p[text()='Show Details'])[8]") public WebElement showDetails;
    @FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']") public WebElement messageYourOrderCancelled;
    @FindBy(xpath = "//p[text()='Return was successfull']") public WebElement messageReturnWasSuccessfull;
    @FindBy(css = "#reasonInput") public WebElement cancelationReason;
    @FindBy(css = "#orderSubmitBtn") public WebElement cancelSubmitBtn;
    @FindBy(css = "#backBtn") public WebElement returnSubmitBtn;
    @FindBy(css = "#dropOffInput") public WebElement whereToDropOff;
    @FindBy(css = "#orderSubmitBtn") public WebElement returnOrderSubmitBtn;
    @FindBy(css = "#headlineInput") public WebElement headlineInput;
    @FindBy(css = "#descriptionInput") public WebElement writtenInput;
    @FindBy(css = "#reviewSubmitBtn") public WebElement addYourReview;
    @FindBy(xpath = "//div[text()='Your review was added successfully']") public WebElement messageYourReviewWasAdded;

}
