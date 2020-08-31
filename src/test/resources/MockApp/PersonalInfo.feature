@personalInfo @all
Feature: Test del registro de la informacion personal

  Scenario Outline: Registro exitoso de informacion personal
    Given Navego a la pantalla de inicio
    When Hago una '<accion>' en la pantalla principal
    Then Deberia ver la pantalla de verificacion de ciudadano
    And Registro mis datos como mi '<dni>', '<fechaNacimiento>' y '<ultimoDigitoDni>' o '<nombreMadre>' o '<nombrePadre>' o '<fechaEmisionDni>' o '<numeroUbigeo>'
    Then El registro fue exitoso
    And Registro mis datos personales como '<celular>', '<email>', '<reemail>'
		Then El registro de mi informacion personal fue exitosa '<accion>'
		
    Examples: 
      | accion                                              | dni      | fechaNacimiento | ultimoDigitoDni | nombreMadre     | nombrePadre  | fechaEmisionDni | numeroUbigeo | celular   | email                        | reemail                      |
      | denuncia penal                                      | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 | 986770766 | brandon.urtecho@unmsm.edu.pe | brandon.urtecho@unmsm.edu.pe |
      | presentar documentos caso penal                     | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 | 986770766 | brandon.urtecho@unmsm.edu.pe | brandon.urtecho@unmsm.edu.pe |
      | denuncia penal violencia contra la mujer            | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 | 986770766 | brandon.urtecho@unmsm.edu.pe | brandon.urtecho@unmsm.edu.pe |
      | presentar documentos caso violencia contra la mujer | 76314913 |        20041995 |               2 | maritza abigail | luis alberto |        07012019 |       140101 | 986770766 | brandon.urtecho@unmsm.edu.pe | brandon.urtecho@unmsm.edu.pe |
