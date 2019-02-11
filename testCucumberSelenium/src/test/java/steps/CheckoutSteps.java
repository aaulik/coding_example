package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckoutPage;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;

    public CheckoutSteps() {
        this.checkoutPage = new CheckoutPage();
    }

    /**
     * Checks that order ready for checkout page is displayed.
     */
    @Then("^I see my order ready for checkout$")
    public void orderCheckoutValidation() {
        checkoutPage.orderCheckoutValidation();
    }

    /**
     * Clicks on Proceed button.
     */
    @When("^I click on Proceed to checkout$")
    public void clickOnProceed() {
        checkoutPage.clickOnProceed();
    }

    /**
     * Checks that the user's address is displayed.
     */
    @Then("^I see my address is displayed$")
    public void addressValidation() {
        checkoutPage.addressValidation();
    }

    /**
     * Checks that the shipping options are displayed.
     */
    @Then("^I see my shipping options$")
    public void shippingValidation() {
        checkoutPage.shippingValidation();
    }

    /**
     * Clicks on agree Terms and Conditions.
     */
    @When("^I agree to the TnC$")
    public void agreeTnc() {
        checkoutPage.agreeTnc();
    }

    /**
     * Validates that the cart summary is displayed.
     */
    @Then("^I see the cart summary$")
    public void cartValidation() {
        checkoutPage.cartValidation();
    }

    /**
     * Clicks on bank wire payment method.
     */
    @When("^I click on Pay by bank wire$")
    public void clickOnPayment() {
        checkoutPage.clickOnPayment();
    }

    /**
     * Checks that the payment method is selected.
     */
    @Then("^I see payment method is chosen$")
    public void paymentValidation() {
        checkoutPage.paymentValidation();
    }

    /**
     * Confirms the order.
     */
    @When("^I confirm my order$")
    public void confirmOrder() {
        checkoutPage.clickOnProceed();
    }

    /**
     * Check the order confirmation message.
     * @param confMessage the expected confirmation message
     */
    @Then("^I see the confirmation message \"([^\"]*)\"$")
    public void confMessageValidation(String confMessage) {
        checkoutPage.confMessageValidation(confMessage);
    }
}
