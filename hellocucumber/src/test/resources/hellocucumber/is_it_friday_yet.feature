Feature: Is it friday yet?

#  Scenario: If we ask on Sunday
#    Given today is Sunday
#    When I ask if it's Friday yet
#    Then I should be told "No"

#  Scenario: If we ask on Friday
#    Given today is Friday
#    When I ask if it's Friday yet
#    Then I should be told "TGIF"

  Scenario Outline: If we ask on <day>
    Given today is "<day>"
    When I ask if it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day       | answer |
      | Monday    | No     |
      | Tuesday   | No     |
      | Wednesday | No     |
      | Thursday  | No     |
      | Friday    | TGIF   |
      | Saturday  | No     |
      | Sunday    | No     |
