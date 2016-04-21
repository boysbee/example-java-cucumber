package example.fizzbuzz;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by nchatmalairut on 4/21/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
    features = {"src/test/resources/example/fizzbuzz"})
public class FizzBuzzTest {
}
