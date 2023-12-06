Feature: Test Phonologix Partners Menu Functionality
  @PartnersMenu
Scenario: Phonologix Partners Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Partners menu
    Then Admin can see partners List and Add Submenu

  @PartnersListSubMenu
  Scenario: Phonologix Partners Submenu List Functionality
    When Admin clicks on Partners List submenu
    Then Admin can see The details of list of Partners
   # When Admin Enters Search Keywords for to see partners record
    #Then Relevant partners Search Results Generated

  @PartnerPageBreadCrumbs
  Scenario: Phonologix Partner Page BreadCrumbs Functionality
    When Admin clicks on Partners perticular page breadcrumbs
    Then admin can see the Partners data on perticular page

#  @PartnersInsideListTableScrollFunction
 #   And Admin can scroll vertically inside the Partners list table
  #  And Admin can scroll horizantally inside the Partners list table
  @PartnersShowCredentials
  Scenario: Phonologix Therapist Show Credentials Functionality
    And Admin can navigate to previous partners page
    When Admin Clicks On Key Icon To View Partners Credentials
    Then Admin Can Copy Partners Credentials
    And Admin Can verify Partners Credentials AlertBox


