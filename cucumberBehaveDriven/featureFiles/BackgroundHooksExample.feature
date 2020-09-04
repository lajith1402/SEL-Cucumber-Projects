@BackgroundHooksExample
Feature: Explaining the Background usage
Background: Joining to Medical, Engg and Agri courses
	Given Should have good education
	And Good knowledge
	
@Medicine	
Scenario: To get into Medicine
	Given Student should have good marks in Biology
	Given Student should pass HSC course
	Then Get into Medical college
	

@Engng
Scenario: Get into Engineering
	Given Student scored good marks in Maths
	Given Student should pass Higher secondary
	Then Get into Engng college
	
	

@Agri
Scenario: Get into Agri field
	Given Student scored good marks in Science
	And Student pass all courses
	Then Get into Agricult college
	
	