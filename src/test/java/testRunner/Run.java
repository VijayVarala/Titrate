package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features={"C:\\Users\\Vijay Varala\\eclipse-workspace\\Mitti\\Features\\login.feature"},
		glue="steps",
		dryRun=!true,
		monochrome = true
		)
public class Run {

}
