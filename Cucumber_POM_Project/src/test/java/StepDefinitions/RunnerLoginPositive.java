package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Eyob\\eclipse-workspace\\Cucumber_POM_Project\\Features",glue= {"StepDefinitions"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports.html"})
public class RunnerLoginPositive {

}

