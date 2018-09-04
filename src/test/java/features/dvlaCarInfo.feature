Feature: Access & Verify DVLA site
  Scenario: DVLA vehicle information page
    Given I am a chrome user
    When I access DVLA vehicle information page
    Then I see DVLA vehicle information page

  Scenario: DVLA Car details page
    Given I am a chrome user
    When I access DVLA vehicle information page
    And I click Start Now
    And I input my car reg number
    And I click Continue
    Then I see my car make details
