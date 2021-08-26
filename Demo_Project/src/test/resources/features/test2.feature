#Author: manjirikaleb@gmail.com
#Feature:Dummy Test cases for UI application Challenging DOM 

Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario: Verify Web page can be opened and the page header matches the expected name "Challenging DOM"
    Given I have open the browser
    When I open Challenging Dom website
    When Verify Web Page Title as Challenging DOM is dispalyed on UI
    Then Close browser   
    
 Scenario: Verify buttons on Web page changing Id's on click event
    Given I have open the browser
    When I open Challenging Dom website
    Then Verify three button on UI in blue Red and Green
    Then Close browser
    
 Scenario: Verify table header  on Web Page
    Given I have open the browser
    When I open Challenging Dom website
    Then Verify table header on webPage
    Then Close browser

 Scenario: Verify table Edit and Delete button  on Web Page
    Given I have open the browser
    When I open Challenging Dom website
    Then Verify edit and delete button in table
    Then Close browser