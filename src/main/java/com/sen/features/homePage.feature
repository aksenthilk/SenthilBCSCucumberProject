Feature:  Home page header links validation
Background: 
         Given user is on home page

Scenario: Validate Header Links 
   	Then user clicks on Job seeker header link 
	And user navigates to My BCSRecruit page 
	Then user clicks on the BCSrecruit logo 
	And navigates to home page 
	Then user clicks on Career Advice header link 
	And user navigates to BCSrecruit Career Advice page 
	Then user clicks on BCSRecruit logo 
	And navigates to the home page 
	Then user closes the home page
	
	

Scenario: Job Search     
	Then user enters the keyword and location and clicks on Search button 
	Then user navigates to the BCSRecruit Search results page 
	Then user clicks BCS Logo
	And user navigates to the Home page
	Then user closes home page
	

