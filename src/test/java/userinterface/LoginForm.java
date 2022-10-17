package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {
    public static final Target USERNAME = Target.the("Input de ingreso de usuario").located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("Input de ingreso de contraseña").located(By.id("LoginPanel0_Password"));
    public static final Target BTN_LOGIN = Target.the("Botón para iniciar sesión").located(By.id("LoginPanel0_LoginButton"));

}
