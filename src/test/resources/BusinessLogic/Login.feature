Feature: Login functionality

Background: SuccessFully canceled Initial Login page
When User open "Chrome" browser with exe as "E:\\Automation support2\\chromedriver.exe"
When user enter URL as "https://www.flipkart.com/"
When user cancle initial Login  window 

@SmockeTest
Scenario: Login functionality With valid credentials
When User navigate on Login button 
When User clike on My Profile
When User enter "9075303134" as user name 
When User entr "9075303134" as password 
When user click on Login button
Then Application Shows user profile to user 


