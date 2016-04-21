Feature: Echo

  Scenario: a say message
    Given The echo
    When I say "notto"
    Then my echo should hello "notto"
