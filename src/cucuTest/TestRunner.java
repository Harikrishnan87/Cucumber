package cucuTest;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 @RunWith(Cucumber.class)
@CucumberOptions(
		features ="Cucufeature"
		,glue={"stepDefinition"}
		)
		
public class TestRunner {

}
