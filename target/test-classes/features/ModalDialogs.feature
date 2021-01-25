Feature: Modal Dialogs

  Scenario: Small Modal
    Given The user is on the "Modal Dialogs" page
    When  The user clicks "Small modal"
    Then  "This is a small modal. It has very less content" is on tthe openning modal
    And   The user closes the modal