package example.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by nchatmalairut on 4/21/2016.
 */
public class StepDefs {
    private Echo echo;


    @Given("^The echo$")
    public void the_echo() throws Throwable {
        echo = new Echo();
    }

    @When("^I say \"(.*?)\"$")
    public void i_say(String name) throws Throwable {
        echo.say(name);
    }

    @Then("^my echo should hello \"(.*?)\"")
    public void my_echo_should_hello_name(String name) throws Throwable {
        assertEquals("hello " + name, echo.echo());
    }

}
