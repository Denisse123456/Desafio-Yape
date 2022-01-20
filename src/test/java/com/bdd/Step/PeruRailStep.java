package com.bdd.Step;

import com.bdd.Page.PeruRailPage;
import net.thucydides.core.steps.ScenarioSteps;

public class PeruRailStep extends ScenarioSteps {

    private PeruRailPage peruRailPage;

    public void cargarLaPaginaDePeruRail()throws InterruptedException {
        peruRailPage.open();
        getDriver().manage().window().maximize();
    }

    public void seleccionoDestino(String Destination)throws InterruptedException {

        peruRailPage.seleccionoDestino(Destination);
    }
    public void seleccionoLaRuta(String Route) throws InterruptedException {
        peruRailPage.seleccionoLaRuta(Route);
    }

    public void seleccionoElTren(String ChooseTrain) {

        peruRailPage.seleccionoElTren(ChooseTrain);
    }

    public void hagoClickEnBusqueda() throws InterruptedException {
        peruRailPage.hagoClickEnBusqueda();

    }

    public void seleccionoLaFecha(String Fecha) throws InterruptedException {

        peruRailPage.seleccionoLaFecha(Fecha);
    }

    public void hagoClickEnBusqueda2() throws InterruptedException {
        peruRailPage.hagoClickEnBusqueda2();

    }

    public void seleccionoElCamaroteSuite(String suitecabins) throws InterruptedException  {
        peruRailPage.seleccionoElCamaroteSuite(suitecabins);
    }

    public void seleccionoSiEsAdulto(String ADULTS) {
        peruRailPage.seleccionoSiEsAdulto(ADULTS);
    }

    public void seleccionoSiEsNiño(String CHILDREN) {
        peruRailPage.seleccionoSiEsNiño(CHILDREN);
    }

    public void seleccionoElCamaroteDoble(String twinbedcabins)throws InterruptedException  {
        peruRailPage.seleccionoElCamaroteDoble(twinbedcabins);
    }

    public void seleccionoElCamaroteConLiteras(String bunkbedcabins) throws InterruptedException {
    peruRailPage.seleccionoElCamaroteConLiteras(bunkbedcabins);
    }

    public void hagoClickEnContinuar()throws InterruptedException {
        peruRailPage.hagoClickEnContinuar();
    }


    public void seleccionoCabinaaYPasajeroa()throws InterruptedException {
        peruRailPage.seleccionoCabinaaYPasajeroa();
    }

    public void seleccionoCabinabYPasajerob()throws InterruptedException {
        peruRailPage.seleccionoCabinabYPasajerob();
    }
    public void escriboElPrimerNombre(String firstName) throws InterruptedException{
        peruRailPage.escriboElPrimerNombre(firstName);
    }

    public void escriboElSegundoNombre(String lastName) {
        peruRailPage.escriboElSegundoNombre(lastName);
    }

    public void seleccionoLaFechaDeNacimiento(String birth) throws InterruptedException{
        peruRailPage.seleccionoLaFechaDeNacimiento(birth);
    }

    public void seleccionoLaNacionalidad(String nationality) {
        peruRailPage.seleccionoLaNacionalidad(nationality);
    }

    public void seleccionoElTipoDeDocumento(String documentID) {
        peruRailPage.seleccionoElTipoDeDocumento(documentID);
    }

    public void escriboElNumeroDeDocumento(String documentNumber) {
        peruRailPage.escriboElNumeroDeDocumento(documentNumber);
    }

    public void seleccionoElSexo(String sex) {
        peruRailPage.seleccionoElSexo(sex);
    }

    public void escriboElCelular(String telephone) {
        peruRailPage.escriboElCelular(telephone);
    }

    public void escriboElEmail(String email) {
        peruRailPage.escriboElEmail(email);
    }

    public void escriboLaConfirmacionDelEmail(String confirmYourEmail) {
        peruRailPage.escriboLaConfirmacionDelEmail(confirmYourEmail);
    }




    public void escriboElPrimerNombreA(String firstNameA) {
        peruRailPage.escriboElPrimerNombreA(firstNameA);
    }

    public void escriboElSegundoNombreA(String lastNameA) {
        peruRailPage.escriboElSegundoNombreA(lastNameA);
    }

    public void seleccionoLaNacionalidadA(String nationalityA) {
        peruRailPage.seleccionoLaNacionalidadA(nationalityA);
    }

    public void seleccionoElTipoDeDocumentoA(String documentIDA) {
        peruRailPage.seleccionoElTipoDeDocumentoA(documentIDA);
    }

    public void escriboElNumeroDeDocumentoA(String documentNumberA) {
        peruRailPage.escriboElNumeroDeDocumentoA(documentNumberA);
    }

    public void seleccionoElSexoA(String sexA) {
        peruRailPage.seleccionoElSexoA(sexA);
    }

    public void escriboElCelularA(String telephoneA) {
        peruRailPage.escriboElCelularA(telephoneA);
    }

    public void escriboElEmailA(String emailA) {
        peruRailPage.escriboElEmailA(emailA);
    }

    public void escriboLaConfirmacionDelEmailA(String confirmYourEmailA){
        peruRailPage.escriboLaConfirmacionDelEmailA(confirmYourEmailA);
    }





    public void escriboElPrimerNombreB(String firstNameB) {
        peruRailPage.escriboElPrimerNombreB(firstNameB);
    }

    public void escriboElSegundoNombreB(String lastNameB) {
        peruRailPage.escriboElSegundoNombreB(lastNameB);
    }

    public void seleccionoLaNacionalidadB(String nationalityB) {
        peruRailPage.seleccionoLaNacionalidadB(nationalityB);
    }

    public void seleccionoElTipoDeDocumentoB(String documentIDB) {
        peruRailPage.seleccionoElTipoDeDocumentoB(documentIDB);
    }

    public void escriboElNumeroDeDocumentoB(String documentNumberB) {
        peruRailPage.escriboElNumeroDeDocumentoB(documentNumberB);
    }

    public void seleccionoElSexoB(String sexB) {
        peruRailPage.seleccionoElSexoB(sexB);
    }

    public void escriboElCelularB(String telephoneB) {
        peruRailPage.escriboElCelularB(telephoneB);
    }

    public void escriboElEmailB(String emailB) {
        peruRailPage.escriboElEmailB(emailB);
    }

    public void escriboLaConfirmacionDelEmailB(String confirmYourEmailB){
        peruRailPage.escriboLaConfirmacionDelEmailB(confirmYourEmailB);
    }

    public void hagoClickEnContinuarB() throws InterruptedException{
        peruRailPage.hagoClickEnContinuarB();
    }



    public void seleccionoElMetodoDePago() {
        peruRailPage.seleccionoElMetodoDePago();
    }

    public void aceptoLosTerminosYCondiciones() throws InterruptedException {
        peruRailPage.aceptoLosTerminosYCondiciones();
    }

    public void ingresoElNumeroDeTarjeta(String card)throws InterruptedException {
        peruRailPage.ingresoElNumeroDeTarjeta(card);
    }

    public void ingresoLaFechaDeExpiracion(String date) {
        peruRailPage.ingresoLaFechaDeExpiracion(date);
    }

    public void ingresoElCodigoDeSeguridad(String securityCode) {
        peruRailPage.ingresoElCodigoDeSeguridad(securityCode);
    }

    public void ingresoElNombre(String name) {
        peruRailPage.ingresoElNombre(name);
    }

    public void hagoClickEnContinuarC() throws InterruptedException{
        peruRailPage.hagoClickEnContinuarC();
    }


    public void validoElCarritoDeCompras() throws InterruptedException {
        peruRailPage.validoElCarritoDeCompras();
    }
}
