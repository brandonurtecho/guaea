@verificationCitizen @all
Feature: Test verificacion del ciudadano

  Scenario Outline: Verificacion exitosa de los datos del ciudadanos en el paso dos del sistema MPE para todas las acciones
  	Given Navego a la pantalla de inicio
    When Hago una '<accion>' en la pantalla principal
    Then Deberia ver la pantalla de verificacion de ciudadano
    And Registro mis datos como mi '<dni>', '<fechaNacimiento>' y '<ultimoDigitoDni>' o '<nombreMadre>' o '<nombrePadre>' o '<fechaEmisionDni>' o '<numeroUbigeo>'
    Then El registro fue exitoso

    Examples: 
      | accion                                              | dni      | fechaNacimiento | ultimoDigitoDni | nombreMadre     | nombrePadre  | fechaEmisionDni | numeroUbigeo |
      | denuncia penal                                      | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 |
      | presentar documentos caso penal                     | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 |
      | denuncia penal violencia contra la mujer            | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 |
      | presentar documentos caso violencia contra la mujer | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 |

