import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:reports/test-report"},  features = {"src/test/resources/features"})
public class RunCucumberTest {
    //Run via console during maven install
}
