package com.Comp.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.Comp.stepDef")
public class TestrunnerClass extends AbstractTestNGCucumberTests {

}