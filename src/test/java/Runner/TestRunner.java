package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features"
        ,glue = {"Steps"},
        plugin = {"pretty","html:target/reports/htmlReports.html"},monochrome = true)

public class TestRunner {

    }

