package com.nttdata.steps;

import com.nttdata.page.DemoBlazePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;
public class DemoBlazeStep {

    WebDriver driver;
    DemoBlazePage demoBlazePage;

    public DemoBlazeStep(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarTiendaDemo(String url){
        driver.get(url);
    }


    public void agregarProducto1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Esperar a que el elemento Samsung Galaxy S6 sea clickable y hacer clic en él
        WebElement samsungGalaxyS6 = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.samsungGalaxyS6));
        samsungGalaxyS6.click();

        WebElement imagen = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.imageElement));
        imagen.isDisplayed();

        WebElement addCar = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.addToCartButton));
        addCar.click();
        // Manejar la alerta
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // Esperar a que el enlace Home sea clickable y hacer clic en él
        WebElement home = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.homeLink));
        home.click();
    }


    public void agregoOtroProducto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nokiaLumia1520 = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.nokiaLumia1520));
        nokiaLumia1520.click();

        WebElement imagen = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.imageElement));
        imagen.isDisplayed();

        WebElement addCar = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.addToCartButton));
        addCar.click();

        // Manejar la alerta
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        // Esperar a que el enlace Home sea clickable y hacer clic en él
        WebElement home = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.homeLink));
        home.click();

    }

    public void verCarrito() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Esperar a que el enlace del carrito sea clickable y hacer clic en él
        WebElement cartLinkElement = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.cartLink));

        // Esperar a que el primer elemento de la tabla sea visible
        cartLinkElement.click();
    }


    public void realizarOrden() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productos = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.tableCell));
        productos.isDisplayed();
        // Esperar a que el botón "Place Order" sea clickable y hacer clic en él
        WebElement placeOrderButtonElement = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.placeOrderButton));
        placeOrderButtonElement.click();
    }

    public void completarFormulario(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Ingresar el nombre
            WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.nameInput));
            nameElement.sendKeys(nombre);

            // Ingresar el país
            WebElement countryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.countryInput));
            countryElement.sendKeys(pais);

            // Ingresar la ciudad
            WebElement cityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.cityInput));
            cityElement.sendKeys(ciudad);

            // Ingresar el número de tarjeta
            WebElement cardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.cardInput));
            cardElement.sendKeys(tarjeta);

            // Ingresar el mes
            WebElement monthElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.monthInput));
            monthElement.sendKeys(mes);

            // Ingresar el año
            WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.yearInput));
            yearElement.sendKeys(anio);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al completar el formulario: " + e.getMessage());
        }
    }


    public void confirmoPedido() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement comprar = wait.until(ExpectedConditions.elementToBeClickable(DemoBlazePage.purchaseButton));
        comprar.click();
    }

    public void verificarCompra() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement verificar = wait.until(ExpectedConditions.visibilityOfElementLocated(DemoBlazePage.thankYouMessage));

        // Aquí puedes agregar lógica adicional para verificar que el mensaje está presente
        if (verificar.isDisplayed()) {
            System.out.println("El mensaje 'Thank you for your purchase!' está presente.");
        } else {
            System.out.println("El mensaje 'Thank you for your purchase!' no está visible.");
        }
    }

}
