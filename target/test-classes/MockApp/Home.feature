@home @all
Feature: Test Home

  Scenario Outline: Seleccionar una accion
    Given Navego a la pantalla de inicio
    When Hago una '<accion>' en la pantalla principal
    Then Deberia ver la pantalla de verificacion de ciudadano

    Examples: 
      | accion                                              |
      | denuncia penal                                      |
      | presentar documentos caso penal                     |
      | denuncia penal violencia contra la mujer            |
      | presentar documentos caso violencia contra la mujer |