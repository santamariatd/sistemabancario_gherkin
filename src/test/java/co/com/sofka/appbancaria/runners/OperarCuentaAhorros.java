package co.com.sofka.appbancaria.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/operacionesCuentaAhorros.feature"},
        glue = {"co.com.sofka.appbancaria.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class OperarCuentaAhorros {
}
