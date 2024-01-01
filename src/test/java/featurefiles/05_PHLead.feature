Feature: Test Phonologix Lead Menu Functionality
  @LeadMenu
  Scenario: Phonologix Lead Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Lead menu
    Then Admin can see Leads List Section