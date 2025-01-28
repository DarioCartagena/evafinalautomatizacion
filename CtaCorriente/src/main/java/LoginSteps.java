/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */

/**
 * Clase de pasos de prueba para el flujo de login y registro de hora médica.
 * @author JOSE DARIO CARTAGENA
 */


/**
 * Clase de pasos de prueba para el flujo de login y registro de hora médica.
 * @author JOSE DARIO CARTAGENA
 */
public class LoginSteps {
    WebDriver driver = new ChromeDriver();

    @Given("El usuario está en la página de login")
    public void givenUsuarioEnLoginPage() {
        driver.get("http://localhost:8080/login.jsp");
    }

    @When("El usuario ingresa el nombre de usuario {string} y la contraseña {string}")
    public void whenUsuarioIngresaDatos(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
    }

    @Then("El usuario debe ser redirigido a la página de bienvenida")
    public void thenUsuarioRedirigidoBienvenida() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue("El mensaje de error no est\u00e1 visible", currentUrl.contains("welcome.jsp"));
        driver.quit();
    }
    
    @Then("El mensaje de error debe ser visible")
    public void thenMensajeDeErrorVisible() {
        WebElement errorMessage = driver.findElement(By.cssSelector("p[style='color:red;']"));
        assertTrue("El mensaje de error no está visible", errorMessage.isDisplayed());
        driver.quit();
    }

    @When("El usuario ingresa los datos para registrar una hora médica")
    public void whenUsuarioIngresaDatosHoraMedica() {
        WebElement mascotaField = driver.findElement(By.id("nombreMascota"));
        WebElement fechaField = driver.findElement(By.id("fechaHora"));
        mascotaField.sendKeys("Fido");
        fechaField.sendKeys("2025-02-01 10:00");
        WebElement registrarButton = driver.findElement(By.id("registrar"));
        registrarButton.click();
    }

    @Then("La hora médica debe ser registrada correctamente")
    public void thenHoraMedicaRegistrada() {
        WebElement successMessage = driver.findElement(By.id("mensajeExito"));
        assertTrue("La hora médica no fue registrada correctamente", successMessage.isDisplayed());
        driver.quit();
    }

    private void assertTrue(String el_mensaje_de_error_no_está_visible, boolean contains) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
