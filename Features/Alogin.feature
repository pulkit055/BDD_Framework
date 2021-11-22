Feature: Bigsmall Automate
@ALogin
Scenario Outline: Login with valid data.
Given Initialize the browser
And User will land to Home page and click on sign in
When User enters <username> and <password>
Then Click to login button
Then browser close

Examples:

|username                                 |password|
|pulkitsinghhm@gmail.com                  |Pulkit@05|

