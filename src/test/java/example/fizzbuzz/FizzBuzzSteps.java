package example.fizzbuzz;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by nchatmalairut on 4/21/2016.
 */
public class FizzBuzzSteps {
    private FizzBuzz _target;
    private String _actualResult;
    @Given("^I am officiating a FizzBuzz game$")
    public void fizzbuzz_game() {
        _target = new FizzBuzz();
    }
    @When("^the number (\\d+) is played$")
    public void number_is_played(int playedNumber) {
        _actualResult = _target.getResult(playedNumber);
    }
    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void should_told_the_correct_answer(String expectedResult) {
        assertEquals(expectedResult, _actualResult);
    }


}
