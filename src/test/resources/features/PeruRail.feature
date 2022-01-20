#language: es

#1.	Proponga usted el plan o listado de actividades a desarrollar para realizar la automatización de pruebas según la funcionalidad indicada en el Anexo 2.
#
#*Revisión de la documentación
#*Pruebas Manuales
#*Creación de los script de automatización
#*Creación de escenarios en el feature
#*Implementación del código
#2. Implemente el código necesario para la creación del script de pruebas automatizadas según la funcionalidad indicada en el Anexo 2 e indique la cobertura de pruebas obtenida por el script.
#Lo realicé con una cobertura sólo para casos OK.
#3. Indique las herramientas y técnicas utilizadas para realizar la automatización de la funcionalidad descrita en el Anexo 2.
#  *Utilicé el IDE INTELLIJ IDEA
#  *Utilicé el lenguaje Gerkin, Java
#  *Utilicé las librerías: Cucumber, Java, Serenity BDD, Selenium Webdriver, entre otras

@TEST_PeruRail
Característica: Automatizar la aplicación de reserva de viajes PeruRail
  Como participante del desafio YAPE
  Quiero automatizar la aplicación de reserva de viajes PeruRail
  Para asegurar la correcta operatividad del
  Booking de viajes PeruRail

  # 1 . Para el servicio de tren BELMOND ANDEAN EXPLORER se utilizará el destino CUSCO y la ruta
  #PUNO > CUSCO

  @BELMOND-Cuzco-Puno/Cuzco-SoloIda
  Esquema del escenario: Reserva de viaje para el servico de tren BELMOND ANDEAN EXPLORER se utilizará el destino CUSCO y la ruta
PUNO > CUSCO

    Dado que cargo la pagina de PeruRail
    Cuando selecciono el destino "<Destination>"
    Y selecciono la ruta "<Route>"
    Y selecciono el tren "<ChooseTrain>"
    Y hago click en la busqueda
    Y selecciono la fecha "<Fecha>"
    Y hago click en la busqueda2

    Y selecciono el camarote suite "<SUITECABINS>"
    Y selecciono si es adulto "<ADULTS>"
    Y selecciono si es niño "<CHILDREN>"
    Y selecciono el camarote doble "<TWINBEDCABINS>"
    Y selecciono si es adulto "<ADULTS1>"
    Y selecciono si es niño "<CHILDREN1>"
    Y selecciono el camarote con Literas "<BUNKBEDCABINS>"
    Y selecciono si es adulto "<ADULTS2>"
    Y selecciono si es niño "<CHILDREN2>"
    Y hago click en continuar

    Y escribo el primer nombre "<FirstName>"
    Y escribo el segundo nombre "<LastName>"
    Y selecciono la fecha de nacimiento "<Birth>"
    Y selecciono la nacionalidad "<Nationality>"
    Y selecciono el tipo de documento "<DocumentID>"
    Y escribo el numero de documento "<DocumentNumber>"
    Y selecciono el sexo "<Sex>"
    Y escribo el celular "<Telephone>"
    Y escribo el email "<Email>"
    Y escribo la confirmacion del email "<ConfirmYourEmail>"

    Y selecciono cabinaa y pasajeroa
    Y escribo el primer nombreA "<FirstNameA>"
    Y escribo el segundo nombreA "<LastNameA>"
    Y selecciono la nacionalidadA "<NationalityA>"
    Y selecciono el tipo de documentoA "<DocumentIDA>"
    Y escribo el numero de documentoA "<DocumentNumberA>"
    Y selecciono el sexoA "<SexA>"
    Y escribo el celularA "<TelephoneA>"
    Y escribo el emailA "<EmailA>"
    Y escribo la confirmacion del emailA "<ConfirmYourEmailA>"

    Y selecciono cabinab y pasajerob
    Y escribo el primer nombreB "<FirstNameB>"
    Y escribo el segundo nombreB "<LastNameB>"
    Y selecciono la nacionalidadB "<NationalityB>"
    Y selecciono el tipo de documentoB "<DocumentIDB>"
    Y escribo el numero de documentoB "<DocumentNumberB>"
    Y selecciono el sexoB "<SexB>"
    Y escribo el celularB "<TelephoneB>"
    Y escribo el emailB "<EmailB>"
    Y escribo la confirmacion del emailB "<ConfirmYourEmailB>"
    Y hago click en continuarB

    Y selecciono el metodo de pago
    Y acepto los terminos y condiciones
    Y Ingreso el numero de tarjeta "<Card>"
      Entonces valido el carrito de compras
    Ejemplos:
      | Destination| Route        |ChooseTrain                     | Fecha     |SUITECABINS|TWINBEDCABINS|BUNKBEDCABINS| ADULTS |CHILDREN |ADULTS1 |CHILDREN1 |ADULTS2 |CHILDREN2 |FirstName | LastName| Birth     |Nationality| DocumentID |DocumentNumber|Sex   |Telephone  |Email                  |ConfirmYourEmail       |FirstNameA | LastNameA|NationalityA| DocumentIDA |DocumentNumberA      |SexA          |TelephoneA  |EmailA                 |ConfirmYourEmailA       |FirstNameB                          | LastNameB |NationalityB| DocumentIDB        |DocumentNumberB|SexB   |TelephoneB    |EmailB              |ConfirmYourEmailB       |Card              |Date       |SecurityCode       |Name       |
      | CUZCO      | Puno > Cusco |Andean Explorer, A Belmond Train| 27/07/2022| 1 CABIN   | 1 CABIN     |1 CABIN      |   1    |  0      | 1      |  0        | 1      |  0      | Denisse  | Mariela | 21-02-1995| Peru      | Identification Card|74047243      |Female| 978606260 | d.mariela.26@gmail.com|d.mariela.26@gmail.com     |Josue     | Neil        | Peru       | Identification Card |71560024      |Male        | 977335635             | josue9423@gmail.com    |josue9423@gmail.com     |Josue      | Pedro     | Peru       | Identification Card|71560027       |Male   | 975886526    | josue23@gmail.com   |josue23@gmail.com      |4111111111111111  |12/2022   |1234                |Denisse    |


  # 1 . Para el servicio de tren BELMOND ANDEAN EXPLORER se utilizará el destino CUSCO y la ruta AREQUIPA > PUNO > CUSCO

    @BELMOND-AREQUIPA-PUNO-CUSCO/Cuzco-SoloIda
    Esquema del escenario: Reserva de viaje para el servicio de tren BELMOND ANDEAN EXPLORER se utilizará el destino CUSCO y la ruta
    AREQUIPA > PUNO > CUSCO

        Dado que cargo la pagina de PeruRail
        Cuando selecciono el destino "<Destination>"
        Y selecciono la ruta "<Route>"
        Y hago click en la busqueda
        Y selecciono la fecha "<Fecha>"
        Y hago click en la busqueda2
        Y selecciono el camarote suite "<SUITECABINS>"
        Y selecciono si es adulto "<ADULTS>"
        Y selecciono si es niño "<CHILDREN>"
        Y hago click en continuar
        Y escribo el primer nombre "<FirstName>"
        Y escribo el segundo nombre "<LastName>"
        Y selecciono la fecha de nacimiento "<Birth>"
        Y selecciono la nacionalidad "<Nationality>"
        Y selecciono el tipo de documento "<DocumentID>"
        Y escribo el numero de documento "<DocumentNumber>"
        Y selecciono el sexo "<Sex>"
        Y escribo el celular "<Telephone>"
        Y escribo el email "<Email>"
        Y escribo la confirmacion del email "<ConfirmYourEmail>"
        Y hago click en continuarB
        Y selecciono el metodo de pago
        Y acepto los terminos y condiciones
        Y Ingreso el numero de tarjeta "<Card>"
        Entonces valido el carrito de compras
        Ejemplos:
            | Destination| Route                   | Fecha     |SUITECABINS| ADULTS |CHILDREN |FirstName | LastName| Birth     |Nationality| DocumentID |DocumentNumber|Sex   |Telephone  |Email                  |ConfirmYourEmail                  |Card              |
            | CUZCO      | AREQUIPA > PUNO > CUSCO | 30/07/2022| 1 CABIN   |   1    |  0      |  Denisse  | Mariela | 21-02-1995| Peru      | Identification Card|74047243      |Female| 978606260 | d.mariela.26@gmail.com|d.mariela.26@gmail.com   |4111111111111111  |



        # 2. Para el servicio de tren EXPEDITION se utilizará la salida MACHU PICCHU y la ruta CUSCO >
        #MACHU PICCHU. En esta ruta aplican los viajes de ida y vuelta o solo viaje de ida.

    @BELMOND-AREQUIPA-PUNO-CUSCO/Cuzco-SoloIda
    Esquema del escenario: Reserva de viaje para el servicio de tren EXPEDITION se utilizará la salida MACHU PICCHU y la ruta CUSCO >
        MACHU PICCHU. En esta ruta aplican los viajes de ida y vuelta o solo viaje de ida.

        Dado que cargo la pagina de PeruRail
        Cuando selecciono el destino "<Destination>"
        Y selecciono la ruta "<Route>"
        Y hago click en la busqueda
        Y selecciono la fecha "<Fecha>"
        Y hago click en la busqueda2
        Y selecciono si es adulto "<ADULTS>"
        Y selecciono si es niño "<CHILDREN>"
        Y hago click en continuar
        Y escribo el primer nombre "<FirstName>"
        Y escribo el segundo nombre "<LastName>"
        Y selecciono la fecha de nacimiento "<Birth>"
        Y selecciono la nacionalidad "<Nationality>"
        Y selecciono el tipo de documento "<DocumentID>"
        Y escribo el numero de documento "<DocumentNumber>"
        Y selecciono el sexo "<Sex>"
        Y escribo el celular "<Telephone>"
        Y escribo el email "<Email>"
        Y escribo la confirmacion del email "<ConfirmYourEmail>"
        Y hago click en continuarB
        Y selecciono el metodo de pago
        Y acepto los terminos y condiciones
        Y Ingreso el numero de tarjeta "<Card>"
        Entonces valido el carrito de compras
        Ejemplos:
            | Destination| Route                      | Fecha        | ADULTS |CHILDREN |FirstName | LastName| Birth     |Nationality| DocumentID |DocumentNumber|Sex   |Telephone  |Email                  |ConfirmYourEmail                  |Card              |
            | Machu Picchu      | Cusco > Machu Picchu| 30/07/2022   |   1    |  0      |  Denisse  | Mariela | 21-02-1995| Peru      | Identification Card|74047243      |Female| 978606260 | d.mariela.26@gmail.com|d.mariela.26@gmail.com   |4111111111111111  |

