Feature: Testing Selenium
  As an example, I want to try how Selenium WebDriver can interact with different element

  Scenario: Interaction with buttons
    Given User access to "https://demoqa.com/buttons" website
    And User double click on the Double Click Me button
    And User right click on the Right Click Me button
    And User click on the Click Me button
    Then the message You have done a double click is displayed
    And the message You have done a right click is displayed
    And the message You have done a dynamic click is displayed

  Scenario Outline: Interaction with text fields and submit button
    Given User access to "https://demoqa.com/text-box" website
    And User fulfill the Full Name field with "<fullName>"
    And User fultill the Email field with "<email>"
    And User fulfill the Current Address field "<currentAddress>"
    And User fulfill the Permanent Address Field "<permanentAddress>"
    Then User click on the Submit button

    Examples:
    | fullName             | email             | currentAddress         | permanentAddress        |
    | Full Name Example 1  | test1@example.com | currentAddressExample1 | permanentAddresExample1 |
    | Full Name Example 2  | test2@example.com | currentAddressExample2 | permanentAddresExample2 |
    | Full Name Example 3  | test3@example.com | currentAddressExample3 | permanentAddresExample3 |