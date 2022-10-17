package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable serenityAppDemo(){
        return Task.where("{0} abre la pagina Serenity App Demo",
                Open.browserOn().the(LoginPage.class)
        );
    }
}
