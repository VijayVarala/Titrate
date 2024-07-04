package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/features"},
dryRun = !true,
snippets = SnippetType.CAMELCASE,
monochrome = true,
glue ="steps")
public class Runner{
	
		
	}

