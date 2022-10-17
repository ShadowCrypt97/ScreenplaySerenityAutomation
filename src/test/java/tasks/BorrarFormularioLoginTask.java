package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import userinterface.LoginForm;

public class BorrarFormularioLoginTask implements Task {

    public static Performable eliminarCredencialesPorDefecto(){
        return Tasks.instrumented(BorrarFormularioLoginTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(LoginForm.USERNAME),
                Clear.field(LoginForm.PASSWORD)
        );

    }
}
