package CucumberMap;

import java.util.Hashtable;

import Utility.HTMLReportGenerator;
import Utility.Seleniumops;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	
	@When("^User open \"([^\"]*)\" browser with exe as \"([^\"]*)\"$")
	public void BeowserLonch(String bname, String exe) throws Throwable
	{
		Object[] input=new Object[2];
	              input[0]=bname;
	              input[1]=exe;
	              Seleniumops.browserLonch(input);
	}

	@When("^user enter URL as \"([^\"]*)\"$")
	public void OpenApplication(String URL) throws Throwable
	{
		Object[] input1=new Object[1];
		input1[0]=URL;
	 Seleniumops.openApplication(input1);
	}

	@When("^user cancle initial Login  window$")
	public void canselLoguin() throws Throwable
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Seleniumops.Clickeonelement(input2);
	    
	}

	@When("^User navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable 
	{
		Object[] input3=new Object[1];
				input3[0]="//*[@class='_1_3w1N']";
				Hashtable<String,Object>output3 =Seleniumops.Mouseover(input3);
				HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^User navigate on Login button$", output3.get("MESSAGE").toString());
	}

	@When("^User clike on My Profile$")
	public void user_clike_on_My_Profile() throws Throwable 
	{
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String,Object>output4 =Seleniumops.Clickeonelement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^User clike on My Profile$", output4.get("MESSAGE").toString());
	}


	@When("^User enter \"([^\"]*)\" as user name$")
	public void user_enter_as_user_name(String uname) throws Throwable
	{
		Object[] input5=new Object[2];
				input5[0]="(//*[@type='text'])[2]";
		        input5[1]=uname;
		        Hashtable<String,Object>output5 = Seleniumops.SendKeys(input5);
		        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^User enter \"([^\"]*)\" as user name$", output5.get("MESSAGE").toString());
	}

	@When("^User entr \"([^\"]*)\" as password$")
	public void user_entr_as_password(String Pass) throws Throwable
	{
	   Object[] input6=new  Object[2];
	             input6[0]="//*[@type='password']";
	    		 input6[1]=Pass;
	    		 Hashtable<String,Object>output6 = Seleniumops.SendKeys(input6);
	    		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^User entr \"([^\"]*)\" as password$", output6.get("MESSAGE").toString());
	    		 
	     
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object>output7 =Seleniumops.Clickeonelement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());
	}

	@Then("^Application Shows user profile to user$")
	public void application_Shows_user_profile_to_user() throws Throwable 
	{
		
		Object[] input8=new Object[2];
		input8[0]="//*[text()='amol telang']";
		input8[1]="amol telang";
		Hashtable<String,Object>output8 =Seleniumops.valid(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application Shows user profile to user$", output8.get("MESSAGE").toString());
		
	}
	
	
}
