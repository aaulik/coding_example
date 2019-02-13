package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.WebDriverUtil;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class MainPage {

    private WebDriver webDriver;

    private WebDriverWait webDriverWait;

    public MainPage() {
        this.webDriver = WebDriverUtil.WEB_DRIVER;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
    }

    /**
     * Opens a page with the provided URL and maximizes the window.
     * @param url the desired URL to open
     */
    public void openPage(String url) {
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    /**
     * Search for an article.
     * @param articleName name of the article which used for search
     */
    public void searchArticle(String articleName) {
        WebElement searchBox = webDriver.findElement(By.id("search_query_top"));
        searchBox.sendKeys(articleName);
        searchBox.submit();
    }

    /**
     * Validates the displayed expected and actual search term.
     * @param articleName the expected search term
     */
    public void validateSearchTerm(String articleName) {
        String actualSearchTerm = webDriver.findElement(By.cssSelector(".lighter")).getText();
        String expectedSearchTerm = "\"" + articleName.toUpperCase() + "\"";
        assertThat(actualSearchTerm).isEqualTo(expectedSearchTerm);
    }

    /**
     * Validates the search result.
     * @param articleName the expected article name
     */
    public void validateSearchResult(String articleName) {
        String actualArticleName = webDriver.findElement(By.cssSelector(".right-block .product-name")).getText();
        assertThat(actualArticleName.toLowerCase(), containsString(articleName));
    }

    /**
     * Click and redirects to the Login page.
     * Checks that is the page is displayed.
     */
    public void goToLoginPage() {
        webDriver.findElement(By.cssSelector(".login")).click();
        assertTrue("Login page is not displayed!", webDriver.findElement(By.id("SubmitCreate")).isDisplayed());
    }

    /**
     * Picks the first article from the "Popular" section.
     * Proceeds to the checkout page.
     * TODO: Extend to be able to pick any article.
     */
    public void pickFirstArticle() {
        String checkoutBtnCss = ".btn.btn-default.button.button-medium>span";
        Actions builder = new Actions(webDriver);
        WebElement firstArticle = webDriver.findElement(By.cssSelector(".product-image-container>a>img"));
        builder.moveToElement(firstArticle).perform();
        webDriver.findElement(By.cssSelector(".ajax_add_to_cart_button")).click();

        WebElement checkoutButton = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(checkoutBtnCss)));
        assertTrue("Checkout button is not displayed!", checkoutButton.isDisplayed());

        webDriver.findElement(By.cssSelector(checkoutBtnCss)).click();
    }
}
