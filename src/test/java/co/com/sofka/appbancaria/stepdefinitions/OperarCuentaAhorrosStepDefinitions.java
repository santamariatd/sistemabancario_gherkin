package co.com.sofka.appbancaria.stepdefinitions;

import co.com.sofka.appbancaria.CuentaAhorros;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OperarCuentaAhorrosStepDefinitions {
    private CuentaAhorros cuentaDeAhorros;
    private double saldoDisponible;

    @Given("^quiero retirar dinero de mi cuenta$")
    public void prepararRetiroDeDinero() {
        cuentaDeAhorros = new CuentaAhorros("ID000XYZ");
    }

    @When("^le indico al sistema la (\\d+) de mi (\\d+)$")
    public void retirarDinero(double cantidadRetiro, double saldoInicial) {
        cuentaDeAhorros.setSaldo(saldoInicial);
        saldoDisponible = cuentaDeAhorros.retirarDinero(cantidadRetiro);
    }

    @Then("^el sistema debe mostrar el (\\d+) con la cantidad retirada restada$")
    public void verificarRetiroDeDinero(double valorEsperado) {
        Assert.assertEquals(valorEsperado,saldoDisponible,0);
    }

    @Given("^quiero consignar dinero a mi cuenta$")
    public void prepararConsignacionDeDinero() {
        cuentaDeAhorros = new CuentaAhorros("ID000FGH");
    }

    @When("^le indico al sistema la (\\d+) a mi (\\d+)$")
    public void consignarDinero(double cantidadConsignacion, double saldoInicial) {
        cuentaDeAhorros.setSaldo(saldoInicial);
        saldoDisponible = cuentaDeAhorros.consignarDinero(cantidadConsignacion);
    }

    @Then("^el sistema debe mostrar el (\\d+) con la cantidad consignada aumentada$")
    public void verificarConsignacionDeDinero(double valorEsperado) {
        Assert.assertEquals(valorEsperado,saldoDisponible,0);
    }
}
