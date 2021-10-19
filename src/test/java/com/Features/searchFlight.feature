Feature: Search Flight feature

Scenario: Entering the data required for searching flight
    Given User is on home page of Simply Travel
    When User enters departure location
    And User enter arival location
    And User selects date
    And User selects no. of passengers and class
    Then User clicks on search button and successfully searches the flight