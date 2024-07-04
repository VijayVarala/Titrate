package com.titrate.testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions
(
		
		features={"C:\\Users\\DELL\\eclipse-workspace\\Mitti\\src\\test\\java\\Features\\login.feature"},
		glue="steps",
		dryRun=!true,
		monochrome = true
		//plugin= {"pretty","html:test-output"} 	
		)
public class Run {

}
