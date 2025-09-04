package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Login.feature"}
		,glue = {"StepDefinitions2","Hooks"},
		tags = "@sanity",
		plugin = {"pretty","html:target/cucumber-reports.html"},
		monochrome = true
		)
public class MyTestRunner extends AbstractTestNGCucumberTests
{
 
}
 
