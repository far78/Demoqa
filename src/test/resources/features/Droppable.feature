Feature: Droppable

  Scenario: Drag and Drop
    Given The user is on the "Droppable" page
    When  The user drags and drops the element
    Then The text in the area changes as  "Dropped!"
  