package base;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Test Runner class
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/features",plugin ={"json:reports/cucumber-report.json"},glue= {"stepDefinitions"}
,tags ={"@FDP-178"})
public class TestRunner{

}
