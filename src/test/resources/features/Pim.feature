Feature: yo quiero hacer las validaciones de la funcionalidad PIM

  @Regresion
    @HU002
  Scenario Outline: add employee
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And the user reaches to add employee
    When the user fill out first name <firstName> middle name <middleName> last name <lastName>


    Examples:
      | userName | password | firstName | middleName | lastName |
      | Admin    | admin123 | Jhonatan  | Tatan      | medina   |
