Feature: Advance Job search
Background: 
         Given user is on home page

Scenario: Job Search     
	Then user enters the keyword and location and clicks on Search button 
	Then user navigates to the BCSRecruit Search results page 
	Then user clicks on BCS Logo
	And user navigates to Home page
	Then user closes the home page

