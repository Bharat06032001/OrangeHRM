package cucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		
		features = {"src/test/java/features/login.feature"},
		dryRun=!true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = false,
		plugin = {"pretty" , "json:Reports1"}
		
		
		)




public class Runner extends AbstractTestNGCucumberTests {
	
}
