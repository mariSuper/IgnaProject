package ignaTests;
import ignaHooks.Hooks;
import ignaPages.HomePageIgna;
import ignaPages.LoginPageIgna;
import ignaUtils.JsonUtils;
import ignaUtils.UserModel;
import org.testng.annotations.Test;

public class LoginPageTest extends Hooks {

    @Test
    public void loginTest() {

        // 1. Citim userul din JSON
        UserModel user = JsonUtils.readJson("src/main/resources/user.json", UserModel.class);

        // 2. Mergem în pagina de Login
        HomePageIgna home = new HomePageIgna(driver);
        home.clickContulMeu();

        // 3. Completăm formularul de login
        LoginPageIgna login = new LoginPageIgna(driver);
        login.loginToAccount(user.getEmail(), user.getPassword());
    }
}