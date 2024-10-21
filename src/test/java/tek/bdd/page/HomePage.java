package tek.bdd.page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class HomePage extends SeleniumUtility {
    //At Constructor level, We have to initialize these elements with Instance of WebDriver.
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(css = "#signinLink") public WebElement homePageSignInBtn;
    @FindBy(css = "#orderLink") public WebElement orderBtn;
    @FindBy(xpath = "//div[@id='cartBtn']") public WebElement homePageCartBtn;
    @FindBy(linkText = "TEKSCHOOL") public WebElement homePageTitle;
    @FindBy(id = "searchInput") public WebElement homePageSearchInput;
    @FindBy(id = "searchBtn") public WebElement homePageSearchBtn;
    @FindBy(xpath = "//select[@id='search']") public WebElement AllDepartments;
    @FindBy(xpath = "//button[@id='hamburgerBtn']") public WebElement All;
    @FindBy(linkText = "Test Selenium") public WebElement TestSelenium;

    @FindBy(xpath = "//div[@class='sidebar_content-item']") public List<WebElement> allDepts;

    @FindBy(xpath = "//span[text()='Electronics']") public WebElement electronics;
    @FindBy(xpath = "//span[text()='Computers']") public WebElement computers;
    @FindBy(xpath = "//span[text()='Smart Home']") public WebElement smartHome;
    @FindBy(xpath = "//span[text()='Sports']") public WebElement sports;
    @FindBy(xpath = "//span[text()='Automative']") public WebElement automative;

    @FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']") public WebElement kasaOutdoorSmartPlug;
    @FindBy(xpath = "//select[@class='product__select']") public WebElement qtyDropDown;
    @FindBy(xpath = "//span[text()='Add to Cart']") public WebElement addToCartBtn;
    @FindBy(css = "#cartQuantity") public WebElement cartQty;
    @FindBy(css = "#cartBtn") public WebElement cartBtn;
    @FindBy(css = "#proceedBtn") public WebElement proceedBtn;
    @FindBy(css = "#addAddressBtn") public WebElement homePageAddANewAddress;
    @FindBy(css = "#addPaymentBtn") public WebElement homePageAddANewPayment;
    @FindBy(css = "#placeOrderBtn") public WebElement placeYourOrder;
    @FindBy(xpath = "//p[text()='Order Placed, Thanks']") public WebElement orderPlacedThanksText;
    @FindBy(xpath = "//select[@id='search']") public WebElement allDepartmentsBtn;
    @FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']") public WebElement apexLegends;





}
