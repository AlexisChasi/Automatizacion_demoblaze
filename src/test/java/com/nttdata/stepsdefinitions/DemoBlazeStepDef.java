package com.nttdata.stepsdefinitions;

import com.nttdata.steps.DemoBlazeStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Map;

public class DemoBlazeStepDef {

    private DemoBlazeStep demoBlazeStep;
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Given("estoy en la página de la tienda demoblaze")
    public void estoyEnLaPáginaDeLaTienda() {
        demoBlazeStep = new DemoBlazeStep(driver);
        demoBlazeStep.navegarTiendaDemo("https://www.demoblaze.com");
        screenShot();

    }
    @When("agrego un celular al carrito")
    public void agregoAlCarrito() {
        demoBlazeStep.agregarProducto1();
        screenShot();
    }
    @And("agrego otro celular al carrito")
    public void agregoOtroCelular() {
        demoBlazeStep.agregoOtroProducto();
        screenShot();
    }

   @Then("visualizo el carrito")
    public void visualizoElCarrito() {
        demoBlazeStep.verCarrito();
        screenShot();
    }

    @And("realizo la orden")
    public void realizoLaOrden() {
        demoBlazeStep.realizarOrden();
        screenShot();
    }

    @And("completo el formulario de pedido con los siguientes datos:")
    public void completoElFormularioDePedidoConLosSiguientesDatos(DataTable dataTable) {
        // Convertir la tabla de datos a un mapa
        Map<String, String> datosPedido = dataTable.transpose().asMap(String.class, String.class);

        // Extraer los datos individuales
        String nombre = datosPedido.get("nombre");
        String pais = datosPedido.get("país");
        String ciudad = datosPedido.get("ciudad");
        String tarjeta = datosPedido.get("tarjeta");
        String mes = datosPedido.get("mes");
        String anio = datosPedido.get("año");

        // Llamar al método de completar formulario en DemoBlazeStep con los datos extraídos
        demoBlazeStep.completarFormulario(nombre, pais, ciudad, tarjeta, mes, anio);
        screenShot();
    }

        @And("confirmo el pedido")
    public void confirmoElPedido() {
        demoBlazeStep.confirmoPedido();
        screenShot();
    }

    @Then("verifico la confirmación de la compra")
    public void verificoLaConfirmaciónDeLaCompra() {
        demoBlazeStep.verificarCompra();
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
