package example.reverse;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by nchatmalairut on 4/26/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
    features = {"src/test/resources/example/reverse"})
public class ReverseNumberTest {
}
