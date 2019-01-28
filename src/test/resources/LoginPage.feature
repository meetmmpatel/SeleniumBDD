Feature: Login to Demo-HR website

  Scenario: Assuming the website in online and ready to test
    Given I can see website home page on internet browser
    When I enter user name "Admin" and Password "admin123"
    And click on loginpage
    Then I should see admin page
