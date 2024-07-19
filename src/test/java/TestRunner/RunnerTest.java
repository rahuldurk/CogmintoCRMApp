package TestRunner;

import org.junit.runner.RunWith;

import BaseLayer.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/Features"},
				glue="Steps",
				dryRun=false,
				monochrome=true)
public class RunnerTest extends BaseClass{
	

}
