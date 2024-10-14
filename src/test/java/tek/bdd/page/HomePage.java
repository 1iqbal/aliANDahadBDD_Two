package tek.bdd.page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.bdd.utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {
    //At Constructor level, We have to initialize these elements with Instance of WebDriver.
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(css = "#signinLink") public WebElement homePageSignInBtn;
    @FindBy(xpath = "//div[@id='cartBtn']") public WebElement homePageCartBtn;
    @FindBy(linkText = "TEKSCHOOL") public WebElement homePageTitle;
    @FindBy(css = "#searchInput") public WebElement homePageSearchInput;
    @FindBy(css = "#searchBtn") public WebElement homePageSearchBtn;
    @FindBy(xpath = "//select[@id='search']") public WebElement homePageAllDepartments;
    @FindBy(xpath = "//button[@id='hamburgerBtn']") public WebElement homePageAll;
    @FindBy(linkText = "Test Selenium") public WebElement homePageTestSelenium;
}
