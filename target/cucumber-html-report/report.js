$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PenalComplaint.feature");
formatter.feature({
  "line": 2,
  "name": "Test registro de denuncia penal",
  "description": "",
  "id": "test-registro-de-denuncia-penal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@penalComplaint"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "",
  "description": "",
  "id": "test-registro-de-denuncia-penal;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "Veo la pantalla del formulario principal de denuncia",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Completo los datos generales asociados al hecho de mi denuncia",
  "rows": [
    {
      "cells": [
        "\u003cCAMPO_DESC_HECHO\u003e",
        "\u003cCAMPO_DELITO\u003e",
        "\u003cCAMPO_OTROS\u003e",
        "\u003cCAMPO_OTRO_DELITO\u003e",
        "\u003cCAMPO_DEPARTAMENTO\u003e",
        "\u003cCAMPO_PROVINCIA\u003e",
        "\u003cCAMPO_DISTRITO\u003e",
        "\u003cCAMPO_LUGAR\u003e",
        "\u003cCAMPO_FECHA\u003e",
        "\u003cCAMPO_HORA\u003e"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Agrego a agraviado",
  "rows": [
    {
      "cells": [
        "CAMPO_OTRO",
        "CAMPO_TIPO_DOCUMENTO",
        "CAMPO_NUMERO_DOCUMENTO",
        "CAMPO_NOMBRES"
      ],
      "line": 18
    },
    {
      "cells": [
        "FALSE",
        "",
        "",
        ""
      ],
      "line": 19
    },
    {
      "cells": [
        "TRUE",
        "DNI",
        "46986598",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 20
    },
    {
      "cells": [
        "TRUE",
        "RUC",
        "45788521",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 21
    },
    {
      "cells": [
        "TRUE",
        "Pasaporte",
        "15487557",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 22
    },
    {
      "cells": [
        "TRUE",
        "Carnet de Extranjería",
        "76325985",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 23
    },
    {
      "cells": [
        "TRUE",
        "Permiso Temporal de Permanencia",
        "12555687",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Agrego a denunciado",
  "rows": [
    {
      "cells": [
        "CAMPO_CONOCIDO",
        "CAMPO_TIPO_DOCUMENTO",
        "CAMPO_NUMERO_DOCUMENTO",
        "CAMPO_NOMBRES"
      ],
      "line": 26
    },
    {
      "cells": [
        "FALSE",
        "",
        "",
        ""
      ],
      "line": 27
    },
    {
      "cells": [
        "TRUE",
        "DNI",
        "41423433",
        "CRISTIAN"
      ],
      "line": 28
    },
    {
      "cells": [
        "TRUE",
        "RUC",
        "54543234",
        "CRISTIAN OMAR"
      ],
      "line": 29
    },
    {
      "cells": [
        "TRUE",
        "Pasaporte",
        "42443565",
        "TINEO GUEVARA"
      ],
      "line": 30
    },
    {
      "cells": [
        "TRUE",
        "Carnet de Extranjería",
        "43425768",
        "CRIS TJ"
      ],
      "line": 31
    },
    {
      "cells": [
        "TRUE",
        "Permiso Temporal de Permanencia",
        "87876534",
        "CRISTINA"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Subo anexos y agregar una observacion",
  "rows": [
    {
      "cells": [
        "CAMPO_RUTA_ANEXOS",
        "CAMPO_OBSERVACIONES"
      ],
      "line": 34
    },
    {
      "cells": [
        "C:\\Users\\bluq1\\Desktop\\agile.pdf",
        "\u003cCAMPO_OBSERVACIONES_ANEXOS\u003e"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "test-registro-de-denuncia-penal;;",
  "rows": [
    {
      "cells": [
        "CAMPO_DESC_HECHO",
        "CAMPO_DELITO",
        "CAMPO_OTROS",
        "CAMPO_OTRO_DELITO",
        "CAMPO_DEPARTAMENTO",
        "CAMPO_PROVINCIA",
        "CAMPO_DISTRITO",
        "CAMPO_LUGAR",
        "CAMPO_FECHA",
        "CAMPO_HORA",
        "CAMPO_OBSERVACIONES_ANEXOS"
      ],
      "line": 38,
      "id": "test-registro-de-denuncia-penal;;;1"
    },
    {
      "cells": [
        "Denuncia realizada por el hecho X en el lugar X con victimas X Y Z.",
        "",
        "TRUE",
        "ME COGOTEARON CAOSA",
        "LIMA",
        "LIMA",
        "SANTIAGO DE SURCO",
        "En la esquina de la calle X",
        "05052020",
        "",
        "Observacion de prueba gaaaaa"
      ],
      "line": 39,
      "id": "test-registro-de-denuncia-penal;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7580507200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Navego a la pantalla de inicio",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Hago una \u0027denuncia penal\u0027 en la pantalla principal",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Deberia ver la pantalla de verificacion de ciudadano",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Registro mis datos como mi \u002776314913\u0027, \u002720041995\u0027 y \u00272\u0027 o \u0027maritza abigail\u0027 o \u0027luis alberto\u0027 o \u002707012019\u0027 o \u0027140101\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "El registro fue exitoso",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Registro mis datos personales como \u002776314913\u0027, \u0027brandon.urtecho@unmsm.edu.pe\u0027, \u0027brandon.urtecho@unmsm.edu.pe\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "El registro de mi informacion personal fue exitosa \u0027denuncia penal\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.java:12"
});
formatter.result({
  "duration": 246429300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "denuncia penal",
      "offset": 10
    }
  ],
  "location": "HomeSteps.java:17"
});
formatter.result({
  "duration": 73452000,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.java:22"
});
formatter.result({
  "duration": 300834300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76314913",
      "offset": 28
    },
    {
      "val": "20041995",
      "offset": 40
    },
    {
      "val": "2",
      "offset": 53
    },
    {
      "val": "maritza abigail",
      "offset": 59
    },
    {
      "val": "luis alberto",
      "offset": 79
    },
    {
      "val": "07012019",
      "offset": 96
    },
    {
      "val": "140101",
      "offset": 109
    }
  ],
  "location": "VerificationCitizenSteps.java:13"
});
formatter.result({
  "duration": 504808900,
  "status": "passed"
});
formatter.match({
  "location": "VerificationCitizenSteps.java:20"
});
formatter.result({
  "duration": 347200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76314913",
      "offset": 36
    },
    {
      "val": "brandon.urtecho@unmsm.edu.pe",
      "offset": 48
    },
    {
      "val": "brandon.urtecho@unmsm.edu.pe",
      "offset": 80
    }
  ],
  "location": "PersonalInfoSteps.java:13"
});
formatter.result({
  "duration": 1447545000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "denuncia penal",
      "offset": 52
    }
  ],
  "location": "PersonalInfoSteps.java:18"
});
formatter.result({
  "duration": 332500,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "",
  "description": "",
  "id": "test-registro-de-denuncia-penal;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@penalComplaint"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Veo la pantalla del formulario principal de denuncia",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Completo los datos generales asociados al hecho de mi denuncia",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "rows": [
    {
      "cells": [
        "Denuncia realizada por el hecho X en el lugar X con victimas X Y Z.",
        "",
        "TRUE",
        "ME COGOTEARON CAOSA",
        "LIMA",
        "LIMA",
        "SANTIAGO DE SURCO",
        "En la esquina de la calle X",
        "05052020",
        ""
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Agrego a agraviado",
  "rows": [
    {
      "cells": [
        "CAMPO_OTRO",
        "CAMPO_TIPO_DOCUMENTO",
        "CAMPO_NUMERO_DOCUMENTO",
        "CAMPO_NOMBRES"
      ],
      "line": 18
    },
    {
      "cells": [
        "FALSE",
        "",
        "",
        ""
      ],
      "line": 19
    },
    {
      "cells": [
        "TRUE",
        "DNI",
        "46986598",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 20
    },
    {
      "cells": [
        "TRUE",
        "RUC",
        "45788521",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 21
    },
    {
      "cells": [
        "TRUE",
        "Pasaporte",
        "15487557",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 22
    },
    {
      "cells": [
        "TRUE",
        "Carnet de Extranjería",
        "76325985",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 23
    },
    {
      "cells": [
        "TRUE",
        "Permiso Temporal de Permanencia",
        "12555687",
        "RENATO MARTIN VARGAS ALFARO"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Agrego a denunciado",
  "rows": [
    {
      "cells": [
        "CAMPO_CONOCIDO",
        "CAMPO_TIPO_DOCUMENTO",
        "CAMPO_NUMERO_DOCUMENTO",
        "CAMPO_NOMBRES"
      ],
      "line": 26
    },
    {
      "cells": [
        "FALSE",
        "",
        "",
        ""
      ],
      "line": 27
    },
    {
      "cells": [
        "TRUE",
        "DNI",
        "41423433",
        "CRISTIAN"
      ],
      "line": 28
    },
    {
      "cells": [
        "TRUE",
        "RUC",
        "54543234",
        "CRISTIAN OMAR"
      ],
      "line": 29
    },
    {
      "cells": [
        "TRUE",
        "Pasaporte",
        "42443565",
        "TINEO GUEVARA"
      ],
      "line": 30
    },
    {
      "cells": [
        "TRUE",
        "Carnet de Extranjería",
        "43425768",
        "CRIS TJ"
      ],
      "line": 31
    },
    {
      "cells": [
        "TRUE",
        "Permiso Temporal de Permanencia",
        "87876534",
        "CRISTINA"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Subo anexos y agregar una observacion",
  "matchedColumns": [
    10
  ],
  "rows": [
    {
      "cells": [
        "CAMPO_RUTA_ANEXOS",
        "CAMPO_OBSERVACIONES"
      ],
      "line": 34
    },
    {
      "cells": [
        "C:\\Users\\bluq1\\Desktop\\agile.pdf",
        "Observacion de prueba gaaaaa"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PenalComplaintSteps.java:15"
});
formatter.result({
  "duration": 429200,
  "status": "passed"
});
formatter.match({
  "location": "PenalComplaintSteps.java:19"
});
formatter.result({
  "duration": 2966876100,
  "status": "passed"
});
formatter.match({
  "location": "PenalComplaintSteps.java:25"
});
