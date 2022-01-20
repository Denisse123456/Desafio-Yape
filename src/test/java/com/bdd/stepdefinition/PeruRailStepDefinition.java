package com.bdd.stepdefinition;

import com.bdd.Step.PeruRailStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PeruRailStepDefinition {
    @Steps
    PeruRailStep peruRailStep;

    @Dado("^que cargo la pagina de PeruRail$")
    public void cargarLaPaginaDePeruRail() throws InterruptedException{
        peruRailStep.cargarLaPaginaDePeruRail();
    }

    @Cuando("^selecciono el destino \"([^\"]*)\"$")
    public void seleccionoElDestino(String Destination)throws InterruptedException {
        peruRailStep.seleccionoDestino(Destination);
    }
    @Y("^selecciono la ruta \"([^\"]*)\"$")
    public void seleccionoLaRuta(String Route) throws InterruptedException {
        peruRailStep.seleccionoLaRuta(Route);
    }
    @Y("^selecciono el tren \"([^\"]*)\"$")
    public void seleccionoElTren(String ChooseTrain) throws Throwable {
        peruRailStep.seleccionoElTren(ChooseTrain);
    }
    @Y("^hago click en la busqueda$")
    public void hagoClickEnLaBusqueda() throws InterruptedException {
        peruRailStep.hagoClickEnBusqueda();
    }
    @Y("^selecciono la fecha \"([^\"]*)\"$")
    public void seleccionoLaFecha(String Fecha) throws Throwable {
        peruRailStep.seleccionoLaFecha(Fecha);
    }

    @Y("^hago click en la busqueda2$")
    public void hagoClickEnLaBusqueda2() throws InterruptedException {
        peruRailStep.hagoClickEnBusqueda2();
    }


    @Y("^selecciono el camarote suite \"([^\"]*)\"$")
    public void seleccionoElCamaroteSuite(String SUITECABINS) throws InterruptedException {
        peruRailStep.seleccionoElCamaroteSuite(SUITECABINS);

    }

    @Y("^selecciono si es adulto \"([^\"]*)\"$")
    public void seleccionoSiEsAdulto(String ADULTS) throws Throwable {
        peruRailStep.seleccionoSiEsAdulto(ADULTS);
    }


    @Y("^selecciono si es niño \"([^\"]*)\"$")
    public void seleccionoSiEsNiño(String CHILDREN) throws Throwable {
        peruRailStep.seleccionoSiEsNiño(CHILDREN);
    }

    @Y("^selecciono el camarote doble \"([^\"]*)\"$")
    public void seleccionoElCamaroteDoble(String TWINBEDCABINS) throws InterruptedException {
        peruRailStep.seleccionoElCamaroteDoble(TWINBEDCABINS);
    }

    @Y("^selecciono el camarote con Literas \"([^\"]*)\"$")
    public void seleccionoElCamaroteConLiteras(String BUNKBEDCABINS) throws InterruptedException {
        peruRailStep.seleccionoElCamaroteConLiteras(BUNKBEDCABINS);

    }

    @Y("^hago click en continuar$")
    public void hagoClickEnContinuar() throws InterruptedException {
        peruRailStep.hagoClickEnContinuar();
    }


    @Y("^selecciono cabinaa y pasajeroa$")
    public void seleccionoCabinaaYPasajeroa()throws InterruptedException {
        peruRailStep.seleccionoCabinaaYPasajeroa();

    }

    @Y("^selecciono cabinab y pasajerob$")
    public void seleccionoCabinabYPasajerob() throws InterruptedException{
        peruRailStep.seleccionoCabinabYPasajerob();
    }

    @Y("^escribo el primer nombre \"([^\"]*)\"$")
    public void escriboElPrimerNombre(String FirstName) throws InterruptedException {
        peruRailStep.escriboElPrimerNombre(FirstName);
    }

    @Y("^escribo el segundo nombre \"([^\"]*)\"$")
    public void escriboElSegundoNombre(String LastName) throws InterruptedException {
        peruRailStep.escriboElSegundoNombre(LastName);
    }

    @Y("^selecciono la fecha de nacimiento \"([^\"]*)\"$")
    public void seleccionoLaFechaDeNacimiento(String Birth) throws InterruptedException {
        peruRailStep.seleccionoLaFechaDeNacimiento(Birth);
    }

    @Y("^selecciono la nacionalidad \"([^\"]*)\"$")
    public void seleccionoLaNacionalidad(String Nationality) throws InterruptedException {
        peruRailStep.seleccionoLaNacionalidad(Nationality);
    }

    @Y("^selecciono el tipo de documento \"([^\"]*)\"$")
    public void seleccionoElTipoDeDocumento(String DocumentID) throws InterruptedException {
        peruRailStep.seleccionoElTipoDeDocumento(DocumentID);
    }

    @Y("^escribo el numero de documento \"([^\"]*)\"$")
    public void escriboElNumeroDeDocumento(String DocumentNumber) throws InterruptedException {
        peruRailStep.escriboElNumeroDeDocumento(DocumentNumber);
    }

    @Y("^selecciono el sexo \"([^\"]*)\"$")
    public void seleccionoElSexo(String Sex) {
        peruRailStep.seleccionoElSexo(Sex);
    }

    @Y("^escribo el celular \"([^\"]*)\"$")
    public void escriboElCelular(String Telephone) throws InterruptedException {
        peruRailStep.escriboElCelular(Telephone);
    }

    @Y("^escribo el email \"([^\"]*)\"$")
    public void escriboElEmail(String Email) throws InterruptedException {
        peruRailStep.escriboElEmail(Email);
    }

    @Y("^escribo la confirmacion del email \"([^\"]*)\"$")
    public void escriboLaConfirmacionDelEmail(String ConfirmYourEmail) throws InterruptedException {
        peruRailStep.escriboLaConfirmacionDelEmail(ConfirmYourEmail);
    }


    @Y("^escribo el primer nombreA \"([^\"]*)\"$")
    public void escriboElPrimerNombreA(String FirstNameA) throws Throwable {
        peruRailStep.escriboElPrimerNombreA(FirstNameA);

    }

    @Y("^escribo el segundo nombreA \"([^\"]*)\"$")
    public void escriboElSegundoNombreA(String LastNameA) throws Throwable {
        peruRailStep.escriboElSegundoNombreA(LastNameA);
    }


    @Y("^selecciono la nacionalidadA \"([^\"]*)\"$")
    public void seleccionoLaNacionalidadA(String NationalityA) throws Throwable {
        peruRailStep.seleccionoLaNacionalidadA(NationalityA);
    }

    @Y("^selecciono el tipo de documentoA \"([^\"]*)\"$")
    public void seleccionoElTipoDeDocumentoA(String DocumentIDA) throws Throwable {
        peruRailStep.seleccionoElTipoDeDocumentoA(DocumentIDA);
    }

    @Y("^escribo el numero de documentoA \"([^\"]*)\"$")
    public void escriboElNumeroDeDocumentoA(String DocumentNumberA) throws Throwable {
        peruRailStep.escriboElNumeroDeDocumentoA(DocumentNumberA);
    }

    @Y("^selecciono el sexoA \"([^\"]*)\"$")
    public void seleccionoElSexoA(String SexA) throws Throwable {
        peruRailStep.seleccionoElSexoA(SexA);
    }

    @Y("^escribo el celularA \"([^\"]*)\"$")
    public void escriboElCelularA(String TelephoneA) throws Throwable {
        peruRailStep.escriboElCelularA(TelephoneA);
    }

    @Y("^escribo el emailA \"([^\"]*)\"$")
    public void escriboElEmailA(String EmailA) throws Throwable {
        peruRailStep.escriboElEmailA(EmailA);
    }

    @Y("^escribo la confirmacion del emailA \"([^\"]*)\"$")
    public void escriboLaConfirmacionDelEmailA(String ConfirmYourEmailA) throws Throwable {
        peruRailStep.escriboLaConfirmacionDelEmailA(ConfirmYourEmailA);
    }





    @Y("^escribo el primer nombreB \"([^\"]*)\"$")
    public void escriboElPrimerNombreB(String FirstNameB) throws Throwable {
        peruRailStep.escriboElPrimerNombreB(FirstNameB);
    }

    @Y("^escribo el segundo nombreB \"([^\"]*)\"$")
    public void escriboElSegundoNombreB(String LastNameB) throws Throwable {
        peruRailStep.escriboElSegundoNombreB(LastNameB);
    }

    @Y("^selecciono la nacionalidadB \"([^\"]*)\"$")
    public void seleccionoLaNacionalidadB(String NationalityB) throws Throwable {
        peruRailStep.seleccionoLaNacionalidadB(NationalityB);
    }

    @Y("^selecciono el tipo de documentoB \"([^\"]*)\"$")
    public void seleccionoElTipoDeDocumentoB(String DocumentIDB) throws Throwable {
        peruRailStep.seleccionoElTipoDeDocumentoB(DocumentIDB);
    }

    @Y("^escribo el numero de documentoB \"([^\"]*)\"$")
    public void escriboElNumeroDeDocumentoB(String DocumentNumberB) throws Throwable {
        peruRailStep.escriboElNumeroDeDocumentoB(DocumentNumberB);
    }

    @Y("^selecciono el sexoB \"([^\"]*)\"$")
    public void seleccionoElSexoB(String SexB) throws Throwable {
        peruRailStep.seleccionoElSexoB(SexB);
    }

    @Y("^escribo el celularB \"([^\"]*)\"$")
    public void escriboElCelularB(String TelephoneB) throws Throwable {
        peruRailStep.escriboElCelularB(TelephoneB);
    }

    @Y("^escribo el emailB \"([^\"]*)\"$")
    public void escriboElEmailB(String EmailB) throws Throwable {
        peruRailStep.escriboElEmailB(EmailB);
    }

    @Y("^escribo la confirmacion del emailB \"([^\"]*)\"$")
    public void escriboLaConfirmacionDelEmailB(String ConfirmYourEmailB) throws Throwable {
        peruRailStep.escriboLaConfirmacionDelEmailB(ConfirmYourEmailB);
    }

    @Y("^hago click en continuarB$")
    public void hagoClickEnContinuarB()throws InterruptedException {
        peruRailStep.hagoClickEnContinuarB();
    }





    @Y("^selecciono el metodo de pago$")
    public void seleccionoElMetodoDePago() {
        peruRailStep.seleccionoElMetodoDePago();
    }

    @Y("^acepto los terminos y condiciones$")
    public void aceptoLosTerminosYCondiciones()  throws InterruptedException{
        peruRailStep.aceptoLosTerminosYCondiciones();
    }

    @Y("^Ingreso el numero de tarjeta \"([^\"]*)\"$")
    public void ingresoElNumeroDeTarjeta(String Card) throws Throwable {
        peruRailStep.ingresoElNumeroDeTarjeta(Card);

    }

    @Y("^ingreso la fecha de expiracion \"([^\"]*)\"$")
    public void ingresoLaFechaDeExpiracion(String Date) throws Throwable {
        peruRailStep.ingresoLaFechaDeExpiracion(Date);

    }

    @Y("^ingreso el codigo de seguridad \"([^\"]*)\"$")
    public void ingresoElCodigoDeSeguridad(String SecurityCode) throws Throwable {
        peruRailStep.ingresoElCodigoDeSeguridad(SecurityCode);

    }

    @Y("^ingreso el Nombre \"([^\"]*)\"$")
    public void ingresoElNombre(String Name) throws Throwable {
        peruRailStep.ingresoElNombre(Name);

    }

    @Y("^hago click en continuarC$")
    public void hagoClickEnContinuarC()throws InterruptedException {
        peruRailStep.hagoClickEnContinuarC();
    }


    @Entonces("^valido el carrito de compras$")
    public void validoElCarritoDeCompras() throws InterruptedException {
        peruRailStep.validoElCarritoDeCompras();
    }
}
