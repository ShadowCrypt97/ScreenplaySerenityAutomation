package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.LoginData;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarLoginCorrecto;
import tasks.BorrarFormularioLoginTask;
import tasks.CompletarLoginTask;
import tasks.IngresarCredencialesDeAccesoTask;

import java.util.List;

public class LoginCorrectoStepDefinitions {
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que voy a ingresar a la pagina Serenity App Demo")
    public void queVoyAIngresarALaPaginaSerenityAppDemo(){
        OnStage.theActorCalled("Usuario").wasAbleTo(
                NavigateTo.serenityAppDemo()
        );
    }


    @And("Elimino las credenciales por default")
    public void eliminoLasCredencialesPorDefault() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BorrarFormularioLoginTask.eliminarCredencialesPorDefecto()
        );
    }


    @And("que voy a ingresar mis credenciales de acceso")
    public void queVoyAIngresarMisCredencialesDeAcceso(List<LoginData> credentialsDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarCredencialesDeAccesoTask.ingresarCredenciales(credentialsDataList)
        );
    }

    @When("complete el inicio de sesion")
    public void completeElInicioDeSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletarLoginTask.completarLogin()
        );
    }

    @Then("Se debe visualizar el dashboard del usuario")
    public void seDebeVisualizarElDashboardDelUsuario() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "Verificar que inició Sesión Correctamente",
                        VerificarLoginCorrecto.verificarTituloDashboard()
                )
        );
    }
}
