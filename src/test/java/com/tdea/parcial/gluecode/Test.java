package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;


    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    private int hora;
    private String hora2;

    @Given("Hora {int}")
    public void hora(Integer hora) {
        this.hora=hora;
    }

    @When("Verificamos si es Night")
    public void verificamos_si_es_night() {
        hora2=Utils.getTimeOfDay(hora);
    }

    @Then("Obtenemos que es Night")
    public void obtenemos_que_es_night() {
        Assertions.assertEquals("Night", hora2);
    }
    @When("Verificamos si es Morning")
    public void verificamos_si_es_morning() {
        hora2=Utils.getTimeOfDay(hora);
    }

    @Then("Obtenemos que es Morning")
    public void obtenemos_que_es_morning() {
        Assertions.assertEquals("Morning", hora2);
    }
    @When("Verificamos si es Afternoon")
    public void verificamos_si_es_afternoon() {
            hora2=Utils.getTimeOfDay(hora);
    }
    @Then("Obtenemos que es Afternoon")
    public void obtenemos_que_es_afternoon() {
            Assertions.assertEquals("Afternoon", hora2);

    }
    @When("Verificamos si es Evening")
    public void verificamos_si_es_evening() {
        hora2=Utils.getTimeOfDay(hora);
    }
    @Then("Obtenemos que es Evening")
    public void obtenemos_que_es_evening() {
        Assertions.assertEquals("Evening", hora2);
    }

    @When("Verificamos si es Invalid hour")
    public void verificamos_si_es_invalid_hour() {
        hora2=Utils.getTimeOfDay(hora);
    }
    @Then("Obtenemos que es Invalid hour")
    public void obtenemos_que_es_invalid_hour() {
        Assertions.assertEquals("Invalid hour", hora2);
    }

}
