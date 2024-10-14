package tek.bdd.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.utility.SeleniumUtility;

public class AccountPage extends SeleniumUtility {

	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "accountLink") public WebElement accountBtnLink;
	@FindBy(id = "nameInput") public WebElement accountProfileNameInput;
	@FindBy(id = "personalPhoneInput") public WebElement accountProfilePhoneNumberInput;
	@FindBy(id = "emailInput") public WebElement accountProfileEmailInput;
	@FindBy(id = "personalUpdateBtn") public WebElement accountProfileUpdateBtn;
	@FindBy(className = "account__information-username") public WebElement accountProfileName;
}

