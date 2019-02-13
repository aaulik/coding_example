@smoke
Feature: Basic_test_set

  Scenario: Search_for_a_product_should_work
    When I open the Main page
    And I search for "printed" article
    Then I see the searched term "printed"
    And I see the search results contains "printed"

  Scenario: User_registration_and_sign_in_should_work
    When I open the Main page
    And I go to the Login page
    And I input email address "testnew1@testmailz.com" and click on Create account
    And I register the user with test data and "test123" password
    And I click on Sign out
    And I sign in with "test18@testmailz.com" email and "test123" password

  Scenario: Purchasing_one_article_should_work
    When I open the Main page
    And I go to the Login page
    And I sign in with "test17@testmailz.com" email and "test123" password
    And I go to the Main page
    And I pick the first article from the Popular ones
    Then I see my order ready for checkout
    When I click on Proceed to checkout
    Then I see my address is displayed
    When I click on Proceed to checkout
    Then I see my shipping options
    When I agree to the TnC
    And I click on Proceed to checkout
    Then I see the cart summary
    When I click on Pay by bank wire
    Then I see payment method is chosen
    When I confirm my order
    Then I see the confirmation message "Your order on My Store is complete."