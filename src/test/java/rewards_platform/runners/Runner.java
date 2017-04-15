package rewards_platform.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/resources/rewards_platform/features",
		glue="rewards_platform.step_definitions",
		tags="@id_Test"
		//dryRun = true
		)


public class Runner {

}
