package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import userinterface.MainDashboard;

public class VerificarLoginCorrecto implements Question<Boolean> {

    public static VerificarLoginCorrecto verificarTituloDashboard(){
        return new VerificarLoginCorrecto();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return MainDashboard.DASHBOARD_TITLE.isVisibleFor(actor);
    }
}
