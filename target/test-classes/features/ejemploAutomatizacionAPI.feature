#language: es
@EjemploDeAutomatizacionAPIs
Característica: Automatización de APIs
  Como participante del desafio YAPE
  Quiero redactar y automatizar APIs
  Para obtener valores y respuestas de las solicitudes enviadas

# -- 1 --
#restful-booker (crear Token Dinámico)
@Restful-Booker @CrearTokenDinamicoHappyPath
Escenario: Crear Token dinámico correctamente
  Dado que configuro el body del servicio: "crearToken"
    | key      | valor       |
    | username | admin       |
    | password | password123 |
  Y configuro las cabeceras
    | cabeceras    | valor            |
    | Content-Type | application/json |
  Cuando ejecuto el servicio con la configuracion del body y cabeceras
    | servicio           | tipo | url   | metodo | formato |
    | Auth - CreateToken | https://restful-booker.herokuapp.com  | /auth | POST   | txt     |
  Entonces valido que el codigo de respuesta sea "200"
  Y guardo la respuesta de la ejecucion

#restful-booker escenario incorrecto
@Restful-Booker @CrearTokenDinamicoUnHappyPath
Escenario: Crear Token dinámico incorrectamente
  Dado que configuro el body del servicio: "crearToken"
    | key      | valor       |
    | username | admin       |
    | password | password123 |
  Y configuro las cabeceras
    | cabeceras    | valor            |
    | Content-Type | application/json |
  Cuando ejecuto el servicio con la configuracion del body y cabeceras
    | servicio           | tipo | url   | metodo | formato |
    | Auth - CreateToken | https://restful-booker.herokuapp.com  | /auths | POST   | txt     |
  Entonces valido que el codigo de respuesta sea "404"
  Y guardo la respuesta de la ejecucion

# -- 2 --
@Restfull-Booker @ObtenerIDLibrosHappyPath
Escenario: Obtener ID's de libros correctamente
  Cuando ejecuto el servicio sin configuraciones
    | servicio | tipo | url | metodo | formato |
    | Obterner-ID-Libros | https://restful-booker.herokuapp.com | /booking | get | json |
  Entonces valido que el codigo de respuesta sea "200"
  Y guardo la respuesta de la ejecucion

@Restfull-Booker @ObtenerIDLibrosUnHappyPath
Escenario: ObtenerID's de Libros incorrectamente
  Cuando ejecuto el servicio sin configuraciones
    | servicio | tipo | url | metodo | formato |
    | Obterner-ID-Libros | https://restful-booker.herokuapp.com | /booking | post | json |
  Entonces valido que el codigo de respuesta sea "500"
  Y guardo la respuesta de la ejecucion

# -- 3 --
  @Restfull-Booker @Ping
  Escenario: Obtener Ping
    Cuando ejecuto el servicio sin configuraciones
      | servicio | tipo | url | metodo | formato |
      | Ping - HealthCheck | https://restful-booker.herokuapp.com | /ping | get | json |
    Entonces valido que el codigo de respuesta sea "201"
    Y guardo la respuesta de la ejecucion



  # ---   ADICIONALES   ---

  ## * Booking - CreateBooking (POST):
  # 1 Happy Path creando un libro y que me de respuesta 200
  @Restful-Booker @CrearBookHappyPath
  Escenario: Crear book correctamente
    Dado que configuro el body del servicio: "crearBook"
      | key      | valor       |
      | firstname | Jim       |
      | lastname | Brown |
      | totalprice | 111 |
      | depositpaid | true |
      | additionalneeds | Breakfast |
      | bookingdates.checkin | 2018-01-01   |
      | bookingdates.checkout | 2019-01-01   |
    Y configuro las cabeceras
      | cabeceras    | valor            |
      | Content-Type | application/json |
    Cuando ejecuto el servicio con la configuracion del body y cabeceras
      | servicio           | tipo | url   | metodo | formato |
      | Booking - CreateBook | https://restful-booker.herokuapp.com  | /booking | POST   | txt     |
    Entonces valido que el codigo de respuesta sea "200"
    Y guardo la respuesta de la ejecucion

      # 1 UnHappy Path al intentar crear un libro, que me devuelva la respuesta: ERRONEA.

  @Restful-Booker @CrearBookUnHappyPath
  Escenario: Crear book erroneamente
    Dado que configuro el body del servicio: "crearBook"
      | key      | valor       |
      | firstname |   Jim  |
      | lastname | Brown |
      | totalprice | 111 |
      | depositpaid | true |
      | bookingdates.checkin | abc   |
      | bookingdates.checkout | 2019-01-01   |
    Y configuro las cabeceras
      | cabeceras    | valor            |
      | Content-Type | application/json |
    Cuando ejecuto el servicio con la configuracion del body y cabeceras
      | servicio           | tipo | url   | metodo | formato |
      | Booking - CreateBook | https://restful-booker.herokuapp.com  | /booking | POST   | txt     |
    Entonces valido que el body de respuesta sea "Invalid date"
    Y guardo la respuesta de la ejecucion

  ## * DeleteBooking (DELETE)
  # 1 Happy Path de cualquiera del delete. 201 respuesta.
  # Se debe actualizar el token de manera manual
  @Restfull-booker @EliminarLibroPorHappyPath
  Esquema del escenario: Eliminar libro por un ID en específico
    Dado que configuro las cabeceras
      | cabeceras    | valor            |
      | Content-Type | application/json |
      | Cookie       | token=fd1f6abeb835cbe |
    Cuando ejecuto el servicio con la configuracion de las cabeceras
      | servicio | tipo | url | metodo | formato |
      | Booking - DeleteBooking | https://restful-booker.herokuapp.com | /booking/<id> | DELETE | txt |
    Entonces valido que el codigo de respuesta sea "201"
    Y guardo la respuesta de la ejecucion
    Ejemplos:
      | id |
      | 1  |

  # 1 UnHappy Path con cualquier valor de respuesta erroneo.
  @Restfull-booker @EliminarLibroPorUnHappyPath
  Esquema del escenario: Eliminar libro por un ID en específico
    Dado que configuro las cabeceras
      | cabeceras    | valor            |
      | Content-Type | application/json |
      | Cookie       | token=9e383d463cf3dbd |
    Cuando ejecuto el servicio con la configuracion de las cabeceras
      | servicio | tipo | url | metodo | formato |
      | Booking - DeleteBooking | https://restful-booker.herokuapp.com | /booking/<id> | DELETE | txt |
    Entonces valido que el codigo de respuesta sea "403"
    Y guardo la respuesta de la ejecucion
    Ejemplos:
      | id |
      | 1  |

  ## * ObtenerLibroPorID
  # Obtener Libro Por ID HappyPath. 200 respuesta.
  @Restfull-booker @ObtenerLibroPorIDHappyPath
  Esquema del escenario: Obtener libro por un ID en específico
    Cuando ejecuto el servicio sin configuraciones
      | servicio | tipo | url | metodo | formato |
      | Obtener-ID-Especifico | https://restful-booker.herokuapp.com | /booking/<id> | get | txt |
    Entonces valido que el codigo de respuesta sea "200"
    Y guardo la respuesta de la ejecucion
    Ejemplos:
      | id |
      | 3  |
      | 4  |
      | 5  |
  # Obtener Libro Por ID UnHappyPath. 404 respuesta.
  @Restfull-booker @ObtenerLibroPorIDUnHappyPath
  Esquema del escenario: Obtener libro por un ID en específico unhappy path
    Cuando ejecuto el servicio sin configuraciones
      | servicio | tipo | url | metodo | formato |
      | Obtener-ID-Especifico | https://restful-booker.herokuapp.com | /booking/<id> | get | txt |
    Entonces valido que el codigo de respuesta sea "404"
    Y guardo la respuesta de la ejecucion
    Ejemplos:
      | id |
      | 333  |