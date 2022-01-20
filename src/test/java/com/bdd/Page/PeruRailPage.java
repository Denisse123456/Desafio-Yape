package com.bdd.Page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;



@DefaultUrl("https://www.perurail.com/")
public class PeruRailPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"destinoSelect\"]") //definición del xpath
    private WebElementFacade seleccionoDestino; //asignar el xpath a la variable

    @FindBy(xpath = "//*[@id=\"rutaSelect\"]")
    private WebElementFacade seleccionarRuta;

    @FindBy(xpath = "//*[@id=\"cbTrenSelect\"]")
    private WebElementFacade seleccionoElTren;

    @FindBy(xpath = "//*[@id=\"btn_search\"]")
    private WebElementFacade buttonBusqueda;

    @FindBy(xpath = "//*[@id=\"date1\"]") //definición del xpath
    private WebElementFacade seleccionoFecha;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[7]") //definición del xpath
    private WebElementFacade seleccionoMes;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]") //definición del xpath
    private WebElementFacade seleccionoLaFecha;

    @FindBy(xpath = "//*[@id=\"btn_search_bae\"]")
    private WebElementFacade buttonBusqueda2;

    @FindBy(xpath = "//*[@id=\"frm_viajes_bae\"]/div[3]/div[2]/div[2]/div[3]/div/div[1]/select")
    private WebElementFacade seleccionoElCamaroteSuite;

    @FindBy(xpath = "//*[@id=\"suite\"]/div/div[2]/div[1]/select")
    private WebElementFacade seleccionoSiEsAdulto;

    @FindBy(xpath = "//*[@id=\"suite\"]/div/div[2]/div[2]/select")
    private WebElementFacade seleccionoSiEsNiño;

    @FindBy(xpath = "//*[@id=\"frm_viajes_bae\"]/div[3]/div[2]/div[3]/div[3]/div/div[1]/select")
    private WebElementFacade seleccionoElCamaroteDoble;

    @FindBy(xpath = "//*[@id=\"frm_viajes_bae\"]/div[3]/div[2]/div[4]/div[3]/div/div[1]/select")
    private WebElementFacade seleccionoElCamaroteConLiteras;

    @FindBy(xpath = "//*[@id=\"continuar_bae\"]")
    private WebElementFacade buttonContinuar;



    @FindBy(xpath = "//*[@id=\"cab-1\"]")
    private WebElementFacade buttonCabina;

    @FindBy(xpath = "//*[@id=\"itm1-1\"]")
    private WebElementFacade buttonPassenger;

    @FindBy(xpath = "//*[@id=\"cab-2\"]")
    private WebElementFacade buttonCabinaa;

    @FindBy(xpath = "//*[@id=\"itm2-1\"]")
    private WebElementFacade buttonPassengera;

    @FindBy(xpath = "//*[@id=\"cab-3\"]")
    private WebElementFacade buttonCabinab;

    @FindBy(xpath = "//*[@id=\"itm3-1\"]")
    private WebElementFacade buttonPassengerb;




    @FindBy(xpath = "//*[@id=\"txt_nombre[suite][cab1][1]\"]")
    private WebElementFacade escriboElPrimerNombre;

    @FindBy(xpath = "//*[@id=\"txt_apellido[suite][cab1][1]\"]")
    private WebElementFacade escriboElSegundoNombre;

    @FindBy(xpath = "//*[@id=\"txt_fecha_nacimiento[suite][cab1][1]\"]")
    private WebElementFacade seleccionoLaFechaDeNacimiento;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]") //definición del xpath
    private WebElementFacade seleccionoMes1;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]") //definición del xpath
    private WebElementFacade seleccionoAño;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]") //definición del xpath
    private WebElementFacade seleccionoLaFecha1;

    @FindBy(xpath = "//*[@id=\"sel_nacion[suite][cab1][1]\"]")
    private WebElementFacade seleccionoLaNacionalidad;

    @FindBy(xpath = "//*[@id=\"sel_tpdoc[suite][cab1][1]\"]")
    private WebElementFacade seleccionoElTipoDeDocumento;

    @FindBy(xpath = "//*[@id=\"txt_nroid[suite][cab1][1]\"]")
    private WebElementFacade escriboElNumeroDeDocumento;

    @FindBy(xpath = "//*[@id=\"sel_sexo[suite][cab1][1]\"]")
    private WebElementFacade seleccionoElSexo;

    @FindBy(xpath = "//*[@id=\"txt_telefono[suite][cab1][1]\"]")
    private WebElementFacade escriboElCelular;

    @FindBy(xpath = "//*[@id=\"txt_mail[suite][cab1][1]\"]")
    private WebElementFacade escriboElEmail;

    @FindBy(xpath = "//*[@id=\"txt_mail_conf[suite][cab1][1]\"]")
    private WebElementFacade escriboLaConfirmacionDelEmail;




    @FindBy(xpath = "//*[@id=\"txt_nombre[twin][cab1][1]\"]")
    private WebElementFacade escriboElPrimerNombretwin;

    @FindBy(xpath = "//*[@id=\"txt_apellido[twin][cab1][1]\"]")
    private WebElementFacade escriboElSegundoNombretwin;

    @FindBy(xpath = "//*[@id=\"sel_nacion[twin][cab1][1]\"]")
    private WebElementFacade seleccionoLaNacionalidadtwin;

    @FindBy(xpath = "//*[@id=\"sel_tpdoc[twin][cab1][1]\"]")
    private WebElementFacade seleccionoElTipoDeDocumentotwin;

    @FindBy(xpath = "//*[@id=\"txt_nroid[twin][cab1][1]\"]")
    private WebElementFacade escriboElNumeroDeDocumentotwin;

    @FindBy(xpath = "//*[@id=\"sel_sexo[twin][cab1][1]\"]")
    private WebElementFacade seleccionoElSexotwin;

    @FindBy(xpath = "//*[@id=\"txt_telefono[twin][cab1][1]\"]")
    private WebElementFacade escriboElCelulartwin;

    @FindBy(xpath = "//*[@id=\"txt_mail[twin][cab1][1]\"]")
    private WebElementFacade escriboElEmailtwin;

    @FindBy(xpath = "//*[@id=\"txt_mail_conf[twin][cab1][1]\"]")
    private WebElementFacade escriboLaConfirmacionDelEmailtwin;





    @FindBy(xpath = "//*[@id=\"txt_nombre[bunk][cab1][1]\"]")
    private WebElementFacade escriboElPrimerNombrebunk;

    @FindBy(xpath = "//*[@id=\"txt_apellido[bunk][cab1][1]\"]")
    private WebElementFacade escriboElSegundoNombrebunk;

    @FindBy(xpath = "//*[@id=\"sel_nacion[bunk][cab1][1]\"]")
    private WebElementFacade seleccionoLaNacionalidadbunk;

    @FindBy(xpath = "//*[@id=\"sel_tpdoc[bunk][cab1][1]\"]")
    private WebElementFacade seleccionoElTipoDeDocumentobunk;

    @FindBy(xpath = "//*[@id=\"txt_nroid[bunk][cab1][1]\"]")
    private WebElementFacade escriboElNumeroDeDocumentobunk;

    @FindBy(xpath = "//*[@id=\"sel_sexo[bunk][cab1][1]\"]")
    private WebElementFacade seleccionoElSexobunk;

    @FindBy(xpath = "//*[@id=\"txt_telefono[bunk][cab1][1]\"]")
    private WebElementFacade escriboElCelularbunk;

    @FindBy(xpath = "//*[@id=\"txt_mail[bunk][cab1][1]\"]")
    private WebElementFacade escriboElEmailbunk;

    @FindBy(xpath = "//*[@id=\"txt_mail_conf[bunk][cab1][1]\"]")
    private WebElementFacade escriboLaConfirmacionDelEmailbunk;

    @FindBy(xpath = "//*[@id=\"btnContinuarPas\"]")
    private WebElementFacade hagoClickEnContinuarB;





    @FindBy(xpath = "//*[@id=\"mastercard\"]")
    private WebElementFacade seleccionoElMetodoDePago;

    @FindBy(xpath = "//*[@id=\"chk_tercon\"]")
    private WebElementFacade aceptoLosTerminosYCondiciones;

    @FindBy(xpath = "//*[@id=\"ingresar_tarjeta\"]")
    private WebElementFacade ingresoElNumeroDeTarjeta;

    @FindBy(xpath = "//*[@id=\"F1009\"]")
    private WebElementFacade ingresoElNumeroDeTarjetaB;

    @FindBy(xpath = "//*[@id=\"F1010_MM\"]")
    private WebElementFacade ingresoLaFechaDeExpiracion;

    @FindBy(xpath = "//*[@id=\"F1010_MM\"]/option[13]")
    private WebElementFacade ingresoLaFechaDeExpiracionB;

    @FindBy(xpath = "//*[@id=\"F1010_YY\"]")
    private WebElementFacade ingresoLaFechaDeExpiracionC;

    @FindBy(xpath = "//*[@id=\"F1010_YY\"]/option[2]")
    private WebElementFacade ingresoLaFechaDeExpiracionD;


    @FindBy(xpath = "//*[@id=\"F1136\"]")
    private WebElementFacade ingresoElCodigoDeSeguridad;

    @FindBy(xpath = "//*[@id=\"F1142\"]")
    private WebElementFacade ingresoElNombre;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    private WebElementFacade hagoClickEnContinuarC;




    @FindBy(xpath = "//*[@id=\"compra\"]/a")
    private WebElementFacade validoElCarritoDeCompras;



    public void seleccionoDestino(String Destination) throws InterruptedException {

        seleccionoDestino.sendKeys(Destination);
        seleccionoDestino.click();
    }

    public void seleccionoLaRuta(String Route)throws InterruptedException {
        seleccionarRuta.sendKeys(Route);
        seleccionarRuta.click();
    }

    public void seleccionoElTren(String ChooseTrain) {

        seleccionoElTren.sendKeys(ChooseTrain);
        seleccionoElTren.click();
    }

    public void hagoClickEnBusqueda() throws InterruptedException {
        buttonBusqueda.click();
        Thread.sleep(1000);
    }


    public void seleccionoLaFecha(String Fecha)throws InterruptedException {
        seleccionoFecha.click();
        Thread.sleep(2000);
        seleccionoMes.click();
        Thread.sleep(2000);
        seleccionoLaFecha.click();
        Thread.sleep(2000);
    }

    public void hagoClickEnBusqueda2() throws InterruptedException {
        buttonBusqueda2.click();
        Thread.sleep(1000);
    }

    public void seleccionoElCamaroteSuite(String suitecabins)throws InterruptedException {
        seleccionoElCamaroteSuite.sendKeys(suitecabins);
        Thread.sleep(1000);
    }
        public void seleccionoSiEsAdulto(String ADULTS) {
            seleccionoSiEsAdulto.sendKeys(ADULTS);
        }

    public void seleccionoSiEsNiño(String CHILDREN) {
        seleccionoSiEsNiño.sendKeys(CHILDREN);
    }
    public void seleccionoElCamaroteDoble(String twinbedcabins) throws InterruptedException{
        seleccionoElCamaroteDoble.sendKeys(twinbedcabins);
        Thread.sleep(1000);
    }

    public void seleccionoElCamaroteConLiteras(String bunkbedcabins)throws InterruptedException{
        seleccionoElCamaroteConLiteras.sendKeys(bunkbedcabins);
        Thread.sleep(1000);
    }


    public void hagoClickEnContinuar() throws InterruptedException{
        buttonContinuar.click();


    }

    public void seleccionoCabinaaYPasajeroa() throws InterruptedException{
        buttonCabinaa.click();
        buttonPassengera.click();
        Thread.sleep(2000);
    }

    public void seleccionoCabinabYPasajerob()throws InterruptedException {
        buttonCabinab.click();
        buttonPassengerb.click();
        Thread.sleep(1000);
    }

    public void escriboElPrimerNombre(String firstName)throws InterruptedException {

        buttonCabina.click();
        Thread.sleep(1000);
        buttonCabina.click();
        escriboElPrimerNombre.sendKeys(firstName);
    }

    public void escriboElSegundoNombre(String lastName) {
        escriboElSegundoNombre.sendKeys(lastName);
    }

    public void seleccionoLaFechaDeNacimiento (String birth) throws InterruptedException{
        seleccionoLaFechaDeNacimiento.click();
        Thread.sleep(1000);
        seleccionoMes1.click();
        Thread.sleep(1000);
        seleccionoAño.click();
        Thread.sleep(1000);
        seleccionoLaFecha1.click();
        Thread.sleep(1000);
    }

    public void seleccionoLaNacionalidad(String nationality) {
        seleccionoLaNacionalidad.sendKeys(nationality);
    }

    public void seleccionoElTipoDeDocumento(String documentID) {
        seleccionoElTipoDeDocumento.sendKeys(documentID);
    }

    public void escriboElNumeroDeDocumento(String documentNumber) {
        escriboElNumeroDeDocumento.sendKeys(documentNumber);
    }

    public void seleccionoElSexo(String sex) {
        seleccionoElSexo.sendKeys(sex);
    }

    public void escriboElCelular(String telephone) {
        escriboElCelular.sendKeys(telephone);
    }

    public void escriboElEmail(String email) {
        escriboElEmail.sendKeys(email);
    }

    public void escriboLaConfirmacionDelEmail(String confirmYourEmail) {
        escriboLaConfirmacionDelEmail.sendKeys(confirmYourEmail);

    }




    public void escriboElPrimerNombreA(String firstNameA) {

        escriboElPrimerNombretwin.click();
        escriboElPrimerNombretwin.sendKeys(firstNameA);

    }

    public void escriboElSegundoNombreA(String lastNameA) {
        escriboElSegundoNombretwin.sendKeys(lastNameA);
    }


    public void seleccionoLaNacionalidadA(String nationalityA) {
        seleccionoLaNacionalidadtwin.sendKeys(nationalityA);
    }

    public void seleccionoElTipoDeDocumentoA(String documentIDA) {
        seleccionoElTipoDeDocumentotwin.sendKeys(documentIDA);
    }

    public void escriboElNumeroDeDocumentoA(String documentNumberA) {
        escriboElNumeroDeDocumentotwin.sendKeys(documentNumberA);
    }

    public void seleccionoElSexoA(String sexA) {
        seleccionoElSexotwin.sendKeys(sexA);
    }

    public void escriboElCelularA(String telephoneA) {
        escriboElCelulartwin.sendKeys(telephoneA);
    }

    public void escriboElEmailA(String emailA) {
        escriboElEmailtwin.sendKeys(emailA);
    }

    public void escriboLaConfirmacionDelEmailA(String confirmYourEmailA) {
        escriboLaConfirmacionDelEmailtwin.sendKeys(confirmYourEmailA);

    }




    public void escriboElPrimerNombreB(String firstNameB) {

        escriboElPrimerNombrebunk.click();
        escriboElPrimerNombrebunk.sendKeys(firstNameB);

    }

    public void escriboElSegundoNombreB(String lastNameB) {
        escriboElSegundoNombrebunk.sendKeys(lastNameB);
    }


    public void seleccionoLaNacionalidadB(String nationalityB) {
        seleccionoLaNacionalidadbunk.sendKeys(nationalityB);
    }

    public void seleccionoElTipoDeDocumentoB(String documentIDB) {
        seleccionoElTipoDeDocumentobunk.sendKeys(documentIDB);
    }

    public void escriboElNumeroDeDocumentoB(String documentNumberB) {
        escriboElNumeroDeDocumentobunk.sendKeys(documentNumberB);
    }

    public void seleccionoElSexoB(String sexB) {
        seleccionoElSexobunk.sendKeys(sexB);
    }

    public void escriboElCelularB(String telephoneB) {
        escriboElCelularbunk.sendKeys(telephoneB);
    }

    public void escriboElEmailB(String emailB) {
        escriboElEmailbunk.sendKeys(emailB);
    }

    public void escriboLaConfirmacionDelEmailB(String confirmYourEmailB) {
        escriboLaConfirmacionDelEmailbunk.sendKeys(confirmYourEmailB);

    }


    public void hagoClickEnContinuarB() throws InterruptedException{
        hagoClickEnContinuarB.click();
        Thread.sleep(10000);
    }


    public void seleccionoElMetodoDePago() {
        seleccionoElMetodoDePago.click();
    }

    public void aceptoLosTerminosYCondiciones() throws InterruptedException {
        aceptoLosTerminosYCondiciones.click();


    }

    public void ingresoElNumeroDeTarjeta(String card) throws InterruptedException {

        ingresoElNumeroDeTarjeta.click();
        Thread.sleep(2000);
    }

    public void ingresoLaFechaDeExpiracion(String date) {

    ingresoLaFechaDeExpiracion.click();
    ingresoLaFechaDeExpiracionB.click();
    ingresoLaFechaDeExpiracionC.click();
    ingresoLaFechaDeExpiracionD.click();


    }

    public void ingresoElCodigoDeSeguridad(String securityCode) {
        ingresoElCodigoDeSeguridad.sendKeys(securityCode);
    }

    public void ingresoElNombre(String name) {
        ingresoElNombre.sendKeys(name);
    }

    public void hagoClickEnContinuarC() {
        hagoClickEnContinuarC.click();
    }

    public void validoElCarritoDeCompras() throws InterruptedException {
        validoElCarritoDeCompras.click();
        Thread.sleep(5000);
    }
}

