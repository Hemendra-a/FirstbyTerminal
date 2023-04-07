
@OffersPage
Feature: Seacrh and place the order for products

  @tag1
  Scenario: Search Experince for products search in both home and Offers page
    Given User is on GreenCart Landing Page
    When user searched with shortname "Tom" extracted actual name of product
    Then User searched for same "Tom" shortname in offers page to check if product exist with same name
    
    Scenario Outline:  Search Experince for products search in both home and Offers page
    Given User is on GreenCart Landing Page
    When user searched with shortnames <Name> extracted actual name of product
    Then User searched for same <Name> shortnames in offers page to check if product exist with same name
    Examples:
    | Name     |
    | Tom      |
   
  