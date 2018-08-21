Feature: Access and verify Car details
  Scenario: DVLA vehicle information page
    Given I am a chrome user
    When I access DVLA vehicle information page
    Then I see DVLA vehicle information page
