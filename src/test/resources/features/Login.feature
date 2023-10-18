Feature: yo como usuario quiero loguearme

  @Regresion
  @HU001
  Scenario Outline: Login success
    Given abrir el navegador
    When the user fill out user <userName> and password <password>


    Examples:
      | userName | password |
      | Admin    | admin123 |
