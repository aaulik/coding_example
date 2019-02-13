$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BasicTests.feature");
formatter.feature({
  "name": "Basic_test_set",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Search_for_a_product_should_work",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Main page",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"printed\" article",
  "keyword": "And "
});
formatter.match({
  "location": "MainSteps.searchForArticle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the searched term \"printed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.searchTermValidation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the search results contains \"printed\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainSteps.searchResultValidation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User_registration_and_sign_in_should_work",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Main page",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Login page",
  "keyword": "And "
});
formatter.match({
  "location": "MainSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input email address \"testnew1@testmailz.com\" and click on Create account",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.inputEmailAndClickOnCreateAccount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I register the user with test data and \"test123\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.registerUserWithTestData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Sign out",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickSignOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I sign in with \"test18@testmailz.com\" email and \"test123\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.signIn(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Purchasing_one_article_should_work",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Main page",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Login page",
  "keyword": "And "
});
formatter.match({
  "location": "MainSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I sign in with \"test17@testmailz.com\" email and \"test123\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.signIn(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the Main page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.goToMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pick the first article from the Popular ones",
  "keyword": "And "
});
formatter.match({
  "location": "MainSteps.pickFirstPopularArticle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my order ready for checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.orderCheckoutValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.clickOnProceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my address is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.addressValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.clickOnProceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my shipping options",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.shippingValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I agree to the TnC",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.agreeTnc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutSteps.clickOnProceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the cart summary",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.cartValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Pay by bank wire",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.clickOnPayment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see payment method is chosen",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.paymentValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm my order",
  "keyword": "When "
});
formatter.match({
  "location": "CheckoutSteps.confirmOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the confirmation message \"Your order on My Store is complete.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutSteps.confMessageValidation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});