Feature: Contact-us
  Background:
    Given User Open Browser Navigate the website Page Contact-us
    When user Press Contact-us button

  Scenario: User Can Fill Form with valid All Data scenario
    When user input All Valid Data “ name”, ”Email” ,”phone” ,” subject” , “ massage”

    And User click on the ”Submit” button

    Then Message successfully submission

