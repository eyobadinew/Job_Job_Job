Feature: feature to test create loginMy Account

  Scenario: A user is allowed to login successfully with valid username and password
    Given I Navigate to "https://tutorialsninja.com/demo/"
    When I Hit My Account link
    And Hit Login link
    And enter a valid email address and a valid password
    And hit login button
    Then I will be redirected to my home page and the page title is "My Account"
    And close the browser
