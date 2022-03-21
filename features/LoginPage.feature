@smoke
Feature: Login functionality 

@smoke
Scenario: Validate login functionality 
	Given user on loginpage 
	When user enters "Admin" 
	And enters "admin123" 
	And click on login <java>
	|java		|java2		|
	|Python		|Python2	|
	|Ruby		|Ruby2		|
	|Ruby		|Ruby2		|
	Then user should be logged into the application 
	When User click on logout 
	Then user should be on login page
	
#Scenario Outline: Validate login functionalities 
#	Given user on loginpage 
#	When user enters "<username>" as username
#	And enters "<password>" as password
#	And click on login 
#	Then user should be logged into the application 
#	When User click on logout 
#	Then user should be on login page
#	
#Examples:
#	|username|password|
#	|Admin   |admin123|
#	|Admin   |admin456|
