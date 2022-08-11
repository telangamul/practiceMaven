package CucumberMap;

import java.net.UnknownHostException;

import org.junit.After;

import Utility.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hookebel
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\NewReport\\flipkart.html", "Flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("---------------------Scenario Start------------------");
		
	}
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println("-----------------------Scenario End----------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	}

}
