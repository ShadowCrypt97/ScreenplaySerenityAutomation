package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LoginForm;

public class CompletarLoginTask implements Task {

    public static Performable completarLogin(){
        return Tasks.instrumented(CompletarLoginTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginForm.BTN_LOGIN));
    }
}
