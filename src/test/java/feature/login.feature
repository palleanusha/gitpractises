Feature: Login to the application
 Scenario: login to the application using valid credentials

Given open the browser
Then enter the url
And enter the username
And enter the password
Then click on login button
When close the browser

 Scenario: login to the application using valid credentials during run time

Given open the browser
Then enter the url "http://localhost:8888"
And enter the username "admin"
And enter the password "12345"
Then click on login button
When close the browser