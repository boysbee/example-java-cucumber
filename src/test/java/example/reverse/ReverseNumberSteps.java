package example.reverse;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by nchatmalairut on 4/26/2016.
 */
public class ReverseNumberSteps {
    private ReverseNumber reverseNumber;
    private String result;


    @Given("^The ReverseNumber$")
    public void the_reversenumber() throws Throwable {
        reverseNumber = new ReverseNumber();
    }

    @When("^I use reverse number (\\d+)$")
    public void i_use_reverse_with_number(int number) throws Throwable {
        result = reverseNumber.reverse(number);
    }

    @Then("^I should be the correct answer is \"([^\"]*)\"$")
    public void should_be_the_correct_answer(String expected) throws Throwable {
        assertEquals(result, expected);
    }
}
