Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   		| password |
    | mark1@enhance.com | 123456   |
    | mark2@enhance.com | 123456   |

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully