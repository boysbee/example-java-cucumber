Feature: Fizz Buzz Game
  So that plays can be validated number
  As a Fizz Buzz
  I want to enter a number and see the correct answer

  Background:
    Given I am officiating a FizzBuzz game

  Scenario Outline: Get answers based on played numbers
    When the number <input> is played
    Then I should be told the correct answer is <expected>
    Examples:
      | input | expected   |
      | 1     | "1"        |
      | 2     | "2"        |
      | 3     | "fizz"     |
      | 6     | "fizz"     |
      | 5     | "buzz"     |
      | 9     | "fizz"     |
      | 10    | "buzz"     |
      | 12    | "fizz"     |
      | 15    | "fizzbuzz" |
      | 20    | "buzz"     |
