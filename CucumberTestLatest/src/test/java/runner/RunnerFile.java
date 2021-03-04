package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Feature/myfeature.feature"
,glue= {"step_def_file"},
tags= {"@MY3,@MY1,~@MY2"})
public class RunnerFile{

}
