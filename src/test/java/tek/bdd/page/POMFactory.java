package tek.bdd.page;

import tek.bdd.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private CreateAccountPage createAccountPage;
    private PlansPage plansPage;
    private UserProfilePage userProfilePage;

    public POMFactory() {
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.accountPage = new AccountPage();
        this.createAccountPage = new CreateAccountPage();
        this.plansPage = new PlansPage();
        this.userProfilePage = new UserProfilePage();
    }
    public HomePage homePage() {
        return this.homePage;
    }
    public LoginPage loginPage() {
    	return this.loginPage;
    }
    public AccountPage accountPage() {
    	return this.accountPage;
    }
    public CreateAccountPage createAccountPage() {
    	return this.createAccountPage;
    }
    public PlansPage plansPage() {
    	return this.plansPage;
    }
    public UserProfilePage userProfilePage() {
    	return this.userProfilePage;
    }

}
