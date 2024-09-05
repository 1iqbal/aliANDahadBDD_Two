package tek.bdd.page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.utility.SeleniumUtility;

public class UserProfilePage extends SeleniumUtility{
	public UserProfilePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//header[contains(text(),'Profile')]")
	public WebElement userProfieHeader;
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	public WebElement userProfileLogoutBtn;

	@FindBy(xpath = "//button[@class='chakra-button chakra-button css-1lzp9bh']")
    public WebElement profileIcon;
	
	@FindBy(xpath= "//p[text()='FULL NAME']")
	public WebElement profileFullName;
	
	@FindBy(xpath="//h2[text()='Customer Service Portal']")
	public WebElement customerServicePortal;
	

}
