@MY

Feature: Login Feature File
 
 @MY1
 Scenario: Login scenario test for Gmail

Given navigate to Gmail page
When user logged in using username as "Neeraj" and password as "12345"
Then home page should be displayed
And cards displayed are"true"

 @MY2
Scenario: Login scenario test for Gmail

Given navigate to Gmail page
When user logged in using username as "Sumit" and password as "2345"
Then home page should be displayed
And cards displayed are"false"


@MY3
 Scenario Outline: − Login functionality for a social networking site.

Given user navigates to Facebook

When I enter Username as "<username>" and Password as "<password>"

Then login should be unsuccessful

 Examples: 
| username  | password  | 
| HEENA | 12345| 
| Rahul | 98765 |