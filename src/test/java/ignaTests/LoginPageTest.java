package ignaTests;
import ignaHooks.Hooks;
import ignaPages.HomePageIgna;
import ignaPages.LoginPageIgna;
import org.testng.annotations.Test;

public class LoginPageTest extends Hooks {

    @Test
    public void loginTest() {

        HomePageIgna home = new HomePageIgna(driver);
        home.clickContulMeu();

        LoginPageIgna login = new LoginPageIgna(driver);
        login.typeEmail("test@email.com");
        login.typePassword("parola123");
        login.clickRememberMe();
        login.clickLoginButton();
    }
}