Feature: Open Google and search a keytext
@OpenGoogle
Scenario: Search the keytext in Google search engine
	Given User is entering the google url google.co.in
	When the user is keying the search text "selenium"
	And press the Enter key
	Then the result is displayed to the user
	

@tagname1 @tagname2
Scenario: Search keyword in google
	Given enter the google url
	When user entering the keytext
	Then Press submit button 