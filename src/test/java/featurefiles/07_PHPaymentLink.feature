Feature: Test Phonologix PaymentLink Menu Functionality
  @PaymentLinkMenu
  Scenario: Phonologix PaymentLink Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on PaymentLink menu
    Then Admin can see PaymentLink details
  @PaymentLinkListSubmenu
  Scenario: Phonologix PaymentLink Submenu List Functionality
    When Admin clicks on PaymentLink-List submenu
    Then Admin can see The details of list of PaymentLinks
      #When Admin Enters Search Keywords
      #Then Relevant Search Results Generated
