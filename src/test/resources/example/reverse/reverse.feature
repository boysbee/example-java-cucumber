Feature: Reverse Number

  Background:
    Given The ReverseNumber

  Scenario Outline: Reverse number a digit
    When I use reverse number <input>
    Then I should be the correct answer is <expected>

    Examples:
      | input | expected |
      | 1     | "1"      |
      | 12    | "21"     |
      | 123   | "321"    |
      | 124   | "421"    |
      | 54321 | "12345"  |
