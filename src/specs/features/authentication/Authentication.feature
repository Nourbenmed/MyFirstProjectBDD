@connexion
Feature: Authentication - OrangeHRM
  En tant qu'utilisateur je souhaite m'authentifier

  @cnxSuccess
  Scenario: Authentication - OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "admin"
    And Je saisie Password "admin123"
    And Je clique sur le boutton login
    Then Je me redirige vers le compte admin

  @cnxFailed
  Scenario: Authentication - OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "admin"
    And Je saisie Password "admin1233"
    And Je clique sur le boutton login
    Then Il m'affiche un message d'erreur "Invalid credentials"


  @cnxUserEmpty
  Scenario: Authentication - OrangeHRM
    Given Je me connecte à l'application OrangeHRM0
    When Je clique sur le boutton login
    Then Il m'affiche un erreur "Required"