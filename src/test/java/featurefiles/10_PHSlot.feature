Feature: Test Phonologix Slot Menu Functionality
  @SlotMenu
  Scenario: Phonologix Slot Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Slot menu
    Then Admin can see Slot Submenu Options
  @SlotCalendarViewSubmenu
  Scenario: Phonologix Slot CalendarView Submenu Functionality
    When Admin clicks on Slot-CalendarView submenu
    Then Admin Can See The Slot Calendar
    When Admin Select The therapist Name From DropDown
    Then Admin Can See Slot Calendar For Selected Therapist
    When Admin Can Select Status from DropDown-List
    Then Admin Can See Slot Calendar For Perticular Status
    When Admin Can Select Start-Time from DropDown-List
    Then Admin Can See Slot Calendar For Perticular Start-Time
      #When Admin Enters Search Keywords
      #Then Relevant Search Results Generated
  #@SlotListScrollTOP-Bottom
  #Scenario: Phonologix Slot Submenu List Scroll Functionality
   # And Admin Can Check the Working Of Scorll Bar Functionality For Slot
  #@SlotCreateSubMenu
  #Scenario: :PhonoLogix Slot Create SubMenu
   # When Admin clicks on Slot-Create submenu
    #Then Admin Can Create New Payment Link


