package TestsRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources",
        glue = {"StepDefinitions"},
        tags = "@Regression",
        plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish=true)
public class Testrunner extends AbstractTestNGCucumberTests
{

}
