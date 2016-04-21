package example.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by boysbee on 4/21/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty")
public class EchoTest {
}
