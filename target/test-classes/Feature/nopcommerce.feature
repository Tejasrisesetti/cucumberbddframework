@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario: Verify the Registration page
    Given open the browser
    When user enter the url "<url>"  
    Then click on the Register
    When click on the Gender 
    Then Enter a Firstname  "<firstname>"
    When enter a Lastname "<lastname>"
    Then Enter date of birth
    Then Enter a Email "<Email>"
    Then Enter a company name
    When enter the Password"<password>"
    Then Enter a  ConfirmPassword "<ConfirmPassword>"
    When click on a Register button
    Then click on the Login component
    When enter the previousemail "<email>"
    And enter the previouspassword "<password>"
    Then click on the login button
    When Click on Electronics button
    Then Select dropdowns
    When Add to cart
    Then Click on cellphones
    Then click on digitaldownloads
   
    
    
 
      
     
    
     
      