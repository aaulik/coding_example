package steps;

import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    /**
     * Inputs the email address and proceeds to the user creation.
     * @param emailAddress the desired email address for user creation
     */
    @When("^I input email address \"([^\"]*)\" and click on Create account$")
    public void inputEmailAndClickOnCreateAccount(String emailAddress) {
        loginPage.inputEmailAndClickOnCreateAccount(emailAddress);
    }

    /**
     * Completing the registration form with test data and desired password.
     * @param password the desired password
     */
    @When("^I register the user with test data and \"([^\"]*)\" password$")
    public void registerUserWithTestData(String password) {
        loginPage.registerUserWithTestData(password);
    }

    /**
     * Click on the Sign out.
     */
    @When("^I click on Sign out$")
    public void clickSignOut() {
        loginPage.clickSignOut();
    }

    /**
     * Sign in with the provided email address and password.
     * @param emailAddress user email address
     * @param password user password
     */
    @When("^I sign in with \"([^\"]*)\" email and \"([^\"]*)\" password$")
    public void signIn(String emailAddress, String password) {
        loginPage.signIn(emailAddress, password);
    }

    /**
     * Redirects to the Main page.
     */
    @When("^I go to the Main page$")
    public void goToMainPage() {
        loginPage.goToMainPage();
    }
}
