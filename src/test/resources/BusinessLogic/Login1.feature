Feature: Login functionality

Background: SuccessFully canceled Initial Login page
When User open "Chrome" browser with exe as "E:\\Automation support2\\chromedriver.exe"
When user enter URL as "https://www.flipkart.com/"
When user cancle initial Login  window 


@RegrssionTest
Scenario Outline: Login functionality With invalid UserName-UC and valid password 
When User navigate on Login button 
When User clike on My Profile
When User enters <UserName> as user name 
When User enters <PassWord> as password 
When user click on Login button
Then Application Shows error message 
Then browser close

Examples: 
        |UserName|PassWord|
        |ABCD|9075303134|
        |9075303134|ABCD|