package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.WebDriverUtil;

public class LoginPage {

    private WebDriver webDriver;

    private WebDriverWait webDriverWait;

    public LoginPage() {
        this.webDriver = WebDriverUtil.WEB_DRIVER;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
    }

    /**
     * Inputs the email address and proceeds to the user creation.
     * Checks that the account creation page is displayed.
     * @param emailAddress the desired email address for user creation
     */
    public void inputEmailAndClickOnCreateAccount(String emailAddress) {
        webDriver.findElement(By.id("email_create")).sendKeys(emailAddress);
        webDriver.findElement(By.id("SubmitCreate")).click();
        WebElement registrationForm = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account-creation_form")));
        Assert.assertTrue("Account creation is not displayed!", registrationForm.isDisplayed());
    }

    /**
     * Completing the registration form with test data and desired password.
     * Checks that it is succeeded.
     * @param password the desired user password
     */
    public void registerUserWithTestData(String password) {
        webDriver.findElement(By.id("customer_firstname")).sendKeys("Testy");
        webDriver.findElement(By.id("customer_lastname")).sendKeys("McTestFace");
        webDriver.findElement(By.id("passwd")).sendKeys(password);
        webDriver.findElement(By.id("address1")).sendKeys("Test street 1");
        webDriver.findElement(By.id("city")).sendKeys("Test");
        webDriver.findElement(By.id("postcode")).sendKeys("45678");
        webDriver.findElement(By.id("phone_mobile")).sendKeys("+4367988565");

        Select stateDropdown = new Select(webDriver.findElement(By.id("id_state")));
        stateDropdown.selectByIndex(4);

        webDriver.findElement(By.id("submitAccount")).click();
        Assert.assertTrue("Account creation did not succeed!", webDriver.findElement(By.id("center_column")).isDisplayed());
    }

    /**
     * Clicks on sign out button.
     * Checks that the login page is displayed.
     */
    public void clickSignOut() {
        webDriver.findElement(By.cssSelector(".logout")).click();
        Assert.assertTrue("Login page is not displayed!", webDriver.findElement(By.id("SubmitCreate")).isDisplayed());
    }

    /**
     * Sign in with the provided email address and password.
     * Checks that the redirection to the next page is worked.
     * @param emailAddress the desired email address
     * @param password the desired password
     */
    public void signIn (String emailAddress, String password){
        webDriver.findElement(By.id("email")).sendKeys(emailAddress);
        webDriver.findElement(By.id("passwd")).sendKeys(password);
        webDriver.findElement(By.id("SubmitLogin")).click();
        Assert.assertTrue("Sign in did not succeed!", webDriver.findElement(By.id("center_column")).isDisplayed());
    }

    /**
     * Redirect back to the Main page.
     * Checks that the page is displayed.
     */
    public void goToMainPage() {
        webDriver.findElement(By.cssSelector(".logo")).click();
        Assert.assertTrue("Main page is not displayed!", webDriver.findElement(By.cssSelector(".homefeatured")).isDisplayed());
    }
}
