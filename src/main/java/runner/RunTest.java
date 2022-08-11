package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
                 (
                	features="src/test/resources/BusinessLogic",
                	tags="@SmockeTest",
                	monochrome=true,
                	plugin="pretty",
                	//dryRun=true,
                	glue="CucumberMap"
                	               		 
                  )
public class RunTest {

}
