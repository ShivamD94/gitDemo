package base;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Test Runner class
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/features",plugin ={"json:reports/cucumber-report.json"},glue= {"stepDefinitions"}
,tags={"~@Ignore", "@FDP-816","@FDP-819"}
//,tags={ "@FDP-397","@FDP-819"}
)
public class TestRunner{

}
