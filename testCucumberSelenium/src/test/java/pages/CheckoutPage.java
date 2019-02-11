package pages;

import cucumber.api.java.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.WebDriverUtil;

public class CheckoutPage {

    private WebDriver webDriver;

    private WebDriverWait webDriverWait;

    public CheckoutPage() {
        this.webDriver = WebDriverUtil.WEB_DRIVER;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
    }

    /**
     * Validates that the checkout page is displayed.
     */
    public void orderCheckoutValidation() {
        WebElement checkoutPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_step")));
        Assert.assertTrue("Checkout is not displayed!", checkoutPage.isDisplayed());
    }

    /**
     * First checks that the proceed button is displayed.
     * Clicks on proceed button.
     */
    public void clickOnProceed() {
        String proceedBtnCss = ".cart_navigation .button-medium";
        WebElement proceedBtn = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(proceedBtnCss)));
        Assert.assertTrue("Proceed is not displayed!", proceedBtn.isDisplayed());
        webDriver.findElement(By.cssSelector(proceedBtnCss)).click();
    }

    /**
     * Validates that the address page is displayed.
     */
    public void addressValidation() {
        WebElement addressPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_delivery")));
        Assert.assertTrue("Address is not displayed!", addressPage.isDisplayed());
    }

    /**
     * Validates that the shipping page is displayed.
     */
    public void shippingValidation() {
        WebElement shippingPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".delivery_options_address")));
        Assert.assertTrue("Shipping is not displayed!", shippingPage.isDisplayed());
    }

    /**
     * Clicks on agree Terms and Conditions.
     */
    public void agreeTnc() {
        webDriver.findElement(By.id("cgv")).click();
    }

    /**
     * Validates that the cart summary is displayed.
     */
    public void cartValidation() {
        WebElement summaryPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_summary")));
        Assert.assertTrue("Summary is not displayed!", summaryPage.isDisplayed());
    }

    /**
     * Clicks on the bank wire payment method.
     * TODO: Can be updated with other payment methods.
     */
    public void clickOnPayment() {
        webDriver.findElement(By.cssSelector(".bankwire")).click();
    }

    /**
     * Validates that the payment method is selected.
     * TODO: Can be updated with other payment methods.
     */
    public void paymentValidation() {
        WebElement paymentPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cheque-box")));
        Assert.assertTrue("Payment is not displayed!", paymentPage.isDisplayed());
    }

    /**
     * Check the order confirmation message.
     * @param expConfMessage the expected confirmation message
     */
    public void confMessageValidation(String expConfMessage) {
        String actualConfMsg = webDriver.findElement(By.cssSelector(".box .dark")).getText();
        Assert.assertEquals(actualConfMsg.toLowerCase(), expConfMessage.toLowerCase());
    }
}
