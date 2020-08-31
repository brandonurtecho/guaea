@penalComplaint @all
Feature: Test registro de denuncia penal

  Background: 
    Given Navego a la pantalla de inicio
    When Hago una 'denuncia penal' en la pantalla principal
    Then Deberia ver la pantalla de verificacion de ciudadano
    And Registro mis datos como mi '76314913', '20041995' y '2' o 'maritza abigail' o 'luis alberto' o '07012019' o '140101'
    Then El registro fue exitoso
    And Registro mis datos personales como '76314913', 'brandon.urtecho@unmsm.edu.pe', 'brandon.urtecho@unmsm.edu.pe'
    Then El registro de mi informacion personal fue exitosa 'denuncia penal'

  Scenario Outline: 
    Given Veo la pantalla del formulario principal de denuncia
    Then Completo los datos generales asociados al hecho de mi denuncia
      | <CAMPO_DESC_HECHO> | <CAMPO_DELITO> | <CAMPO_OTROS> | <CAMPO_OTRO_DELITO> | <CAMPO_DEPARTAMENTO> | <CAMPO_PROVINCIA> | <CAMPO_DISTRITO> | <CAMPO_LUGAR> | <CAMPO_FECHA> | <CAMPO_HORA> |
    And Agrego a agraviado
      | CAMPO_OTRO | CAMPO_TIPO_DOCUMENTO            | CAMPO_NUMERO_DOCUMENTO | CAMPO_NOMBRES               |
      | FALSE      |                                 |                        |                             |
      | TRUE       | DNI                             |               46986598 | RENATO MARTIN VARGAS ALFARO |
      | TRUE       | RUC                             |               45788521 | RENATO MARTIN VARGAS ALFARO |
      | TRUE       | Pasaporte                       |               15487557 | RENATO MARTIN VARGAS ALFARO |
      | TRUE       | Carnet de Extranjería           |               76325985 | RENATO MARTIN VARGAS ALFARO |
      | TRUE       | Permiso Temporal de Permanencia |               12555687 | RENATO MARTIN VARGAS ALFARO |
    And Agrego a denunciado
      | CAMPO_CONOCIDO | CAMPO_TIPO_DOCUMENTO            | CAMPO_NUMERO_DOCUMENTO | CAMPO_NOMBRES |
      | FALSE          |                                 |                        |               |
      | TRUE           | DNI                             |               41423433 | CRISTIAN      |
      | TRUE           | RUC                             |               54543234 | CRISTIAN OMAR |
      | TRUE           | Pasaporte                       |               42443565 | TINEO GUEVARA |
      | TRUE           | Carnet de Extranjería           |               43425768 | CRIS TJ       |
      | TRUE           | Permiso Temporal de Permanencia |               87876534 | CRISTINA      |
    And Subo anexos y agregar una observacion
      | CAMPO_RUTA_ANEXOS                    | CAMPO_OBSERVACIONES          |
      | C:\\Users\\bluq1\\Desktop\\agile.pdf | <CAMPO_OBSERVACIONES_ANEXOS> |

    Examples: 
      | CAMPO_DESC_HECHO                                                    | CAMPO_DELITO | CAMPO_OTROS | CAMPO_OTRO_DELITO   | CAMPO_DEPARTAMENTO | CAMPO_PROVINCIA | CAMPO_DISTRITO    | CAMPO_LUGAR                 | CAMPO_FECHA | CAMPO_HORA | CAMPO_OBSERVACIONES_ANEXOS   |
      | Denuncia realizada por el hecho X en el lugar X con victimas X Y Z. |              | TRUE        | ME COGOTEARON CAOSA | LIMA               | LIMA            | SANTIAGO DE SURCO | En la esquina de la calle X |    05052020 |            | Observacion de prueba gaaaaa |
      ##| Denuncia realizada por el hecho X en el lugar X con victimas X Y Z. | Robo         | FALSE       |                     |
