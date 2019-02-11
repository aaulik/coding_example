package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;

public class MainSteps {
    private MainPage mainPage;

    public MainSteps() {
        this.mainPage = new MainPage();
    }

    /**
     * Opens the Main page.
     */
    @When("^I open the Main page$")
    public void openMainPage() {
        mainPage.openPage("http://automationpractice.com/index.php");
    }

    /**
     * Search for an article.
     * @param articleName the name of the desire article.
     */
    @When("^I search for \"([^\"]*)\" article$")
    public void searchForArticle(String articleName) {
        mainPage.searchArticle(articleName);
    }

    /**
     * Checks that the search term is displayed.
     * @param articleName the expected search term
     */
    @Then("^I see the searched term \"([^\"]*)\"$")
    public void searchTermValidation(String articleName) {
        mainPage.validateSearchTerm(articleName);
    }

    /**
     * Checks that the results are containing the desired article.
     * @param articleName the expected article name
     */
    @Then("^I see the search results contains \"([^\"]*)\"$")
    public void searchResultValidation(String articleName) {
        mainPage.validateSearchResult(articleName);
    }

    /**
     * Redirects to the Login page.
     */
    @When("^I go to the Login page$")
    public void goToLoginPage() {
        mainPage.goToLoginPage();
    }

    /**
     * Picks the first article from the Popular section.
     */
    @When("^I pick the first article from the Popular ones$")
    public void pickFirstPopularArticle() {
        mainPage.pickFirstArticle();
    }
}
