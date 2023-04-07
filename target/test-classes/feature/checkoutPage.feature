
@PlaceOrder
Feature: place the order for products

    Scenario Outline:  Search Experince for products search in both home and Offers page
    Given User is on GreenCart Landing Page
    When user searched with shortnames <Name> extracted actual name of product
    And Added "4" items of the selected product to cart
    Then user proceeds to Checkout and validate the <Name> items in Checkout page
    And verify user has ability to enter promo code and place the order
    Examples:
    | Name     |
    | Tom      |
   
  