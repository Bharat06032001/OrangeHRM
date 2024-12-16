Feature: Login page

	Scenario: Login should be success
	
	Given User navigate the application
	
#	And User clicks login link 
	
	And User Enters the username as "Admin"
	And User Enters the password as "admin123"
	
	When User clicks login button
	
	Then login should be success