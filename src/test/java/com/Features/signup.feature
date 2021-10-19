Feature: Sign up feature of Simple Travel

Scenario: Filling Sign up form 
    Given User is on home page
    When User clicks on sign up
    And User enters full name
    And User enters Email 
    And User enters Phone number
    And Uer enter address
    And User selects age group
    And User selects gender
    And User selects hobbies
    And User selects Interests
    And User enters password
    And User re-enters password
    Then User clicks on register and successfully signs up