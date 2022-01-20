$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ejemploAutomatizacionAPI.feature");
formatter.feature({
  "name": "Automatización de APIs",
  "description": "  Como un estudiante de escuela\n  Quiero redactar y automatizar APIs\n  Para obtener valores y respuestas de las solicitudes enviadas",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@EjemploDeAutomatizacionAPIs"
    }
  ]
});
formatter.scenario({
  "name": "Crear book correctamente",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@EjemploDeAutomatizacionAPIs"
    },
    {
      "name": "@Restful-Booker"
    },
    {
      "name": "@CrearBookHappyPath"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que configuro el body del servicio: \"crearBook\"",
  "rows": [
    {
      "cells": [
        "key",
        "valor"
      ]
    },
    {
      "cells": [
        "firstname",
        "Jim"
      ]
    },
    {
      "cells": [
        "lastname",
        "Brown"
      ]
    },
    {
      "cells": [
        "totalprice",
        "111"
      ]
    },
    {
      "cells": [
        "depositpaid",
        "true"
      ]
    },
    {
      "cells": [
        "additionalneeds",
        "Breakfast"
      ]
    },
    {
      "cells": [
        "bookingdates.checkin",
        "2018-01-01"
      ]
    },
    {
      "cells": [
        "bookingdates.checkout",
        "2019-01-01"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "APIStepDefinition.configuroElBodyDelServicio(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "configuro las cabeceras",
  "rows": [
    {
      "cells": [
        "cabeceras",
        "valor"
      ]
    },
    {
      "cells": [
        "Content-Type",
        "application/json"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "APIStepDefinition.configuroLasCabeceras(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ejecuto el servicio con la configuracion del body y cabeceras",
  "rows": [
    {
      "cells": [
        "servicio",
        "tipo",
        "url",
        "metodo",
        "formato"
      ]
    },
    {
      "cells": [
        "Booking - CreateBook",
        "https://restful-booker.herokuapp.com",
        "/booking",
        "POST",
        "txt"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "APIStepDefinition.ejecutoElServicioConLaConfiguracionDelBodyYCabeceras(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que el codigo de respuesta sea \"200\"",
  "keyword": "Entonces "
});
formatter.match({
  "location": "APIStepDefinition.validoQueElCodigoDeRespuestaSea(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "guardo la respuesta de la ejecucion",
  "keyword": "Y "
});
formatter.match({
  "location": "APIStepDefinition.guardoLaRespuestaDeLaEjecucion()"
});
formatter.result({
  "status": "passed"
});
});