Feature: Home page

  #  @home_page @home_page_display
  #  Scenario Outline: Check page display
  #    Given A user navigates to HomePage "<countryCode>"
  ##    Then Google logo is displayed
  ##    And search bar is displayed
  #
  #    Examples:
  #      | countryCode |
  #      | fr |
  #      | com |
  #@home_page @home_page_title
  #Scenario: Check title
    #Given A user navigates to HomePage "fr"
    #Then page title is "Google"

    
    Scenario:
    Given A user navigates to automationpractice site
    And page title is "My Store"
    When User select the summer dress options 
    And User add the item into the cart
    And User select checkout from cart summary page
    Then User should be naviage to login page
    
    
    
    
   
   
  