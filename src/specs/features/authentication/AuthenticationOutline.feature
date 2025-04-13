@tag
Feature: Authentication - Outline - OrangeHRM
  En tant qu'utilisateur je souhaite m'authentifier à l'application OrangeHRM avec un scénario Outline

  @tag2
  Scenario Outline: Authentication - OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "<login>"
    And Je saisie Password "<password>"
    And Je clique sur le boutton login


    Examples:
      | login  | password |
      | admin  | admin123 |
      | admin1 | admin123 |

