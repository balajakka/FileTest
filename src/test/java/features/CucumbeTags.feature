Feature: Cucumber tags
  @Sanity
  Scenario: ladbrokes registration
    Given I am sanity tag tester
    When I access sanity pack
    Then I see sanity pack test result

  @Smoke
  Scenario: ladbrokes registration
    Given I am smoke tag tester
    When I access smoke pack
    Then I see smoke pack test result


  @regression
  Scenario: ladbrokes registration
    Given I am reg tag tester
    When I access regression pack
    Then I see regression pack test result
