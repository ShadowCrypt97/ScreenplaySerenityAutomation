package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainDashboard {
    public static final Target DASHBOARD_TITLE = Target.the("Titulo dashboard principal").located(By.cssSelector("section.content-header > h1"));
}
