Feature: Registration Form

  Scenario: Complete and Submit Form

    Given The user is on the "Practice Form" page
    When  The user enters all the details
    And   The user submits the form
    Then  The user receives "Thanks for submitting the form" on a pop up

    Scenario: Uncompleted Form
      Given The user is on the "Practice Form" page
      When The user doesnt fill the "Mobile" box
      And  The user submits the form
      Then The user dosnt receive popup message
