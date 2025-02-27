@tag
Feature: Authentication - Outline - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier à l'application OrangeHRM avec un scénario Outline

  @tag2
  Scenario Outline: Authentication - Outline - OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie login "<login>"
    And Je saisie mot de passe  "<password>"

    Examples:
      |login  |password |
      |admin  |admin123 |
      |admin1  |admin123 |

