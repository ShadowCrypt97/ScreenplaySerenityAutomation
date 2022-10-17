package tasks;

import models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginForm;

import java.util.List;

public class IngresarCredencialesDeAccesoTask implements Task {

    private final List<LoginData> credentialsDataList;

    public IngresarCredencialesDeAccesoTask(List<LoginData> credentialsDataList) {
        this.credentialsDataList = credentialsDataList;
    }

    public static Performable ingresarCredenciales(List<LoginData> credentialsDataList){
        return Tasks.instrumented(IngresarCredencialesDeAccesoTask.class,credentialsDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String username = credentialsDataList.get(0).getUsername();
        String password = credentialsDataList.get(0).getPassword();

        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USERNAME),
                Enter.theValue(password).into(LoginForm.PASSWORD)
        );
    }
}
