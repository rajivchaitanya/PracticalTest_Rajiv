Feature: Testscenario
  As a test manager

 @Userstory1 @UserStory
  Scenario: UserStory1
    Given I have the kiwisaver retirement calculator
    When Check information icons
    Then Click and Check the current age information message


   @UserStory2 @UserStory
  Scenario Outline: UserStory2
    Given  I have the kiwisaver retirement calculator
    When i have the input for retirement page "<age>"  and "<PIR>" and "<KSBAL>" and "<frequency>"
    And  i have the "<sal>" and "<empl>" and "<Memcontrib>"
    And   i have the "<Risk>" and "<Savingsgoal>" and <contrib>
     Then It should return balances at retirement "<value>"


  Examples:
    | age  | empl | PIR | KSBAL   | contrib    | sal   | Memcontrib | Risk  | Savingsgoal | value   | frequency |
    | 30   | yes  | 17.5 | 0      | 0          | 82000 | 4          |H      | 0           | 279509  | N         |
    | 45   | yes  | 10.5 | 100000 | 90         | 0     | 0          |M      | 290000      | 212143  | F         |
    | 55   | No   | 10.5 | 140000 | 10         | 0     | 0          |M      | 200000      | 168278  | A         |




