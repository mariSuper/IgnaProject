package ignaTests;
import ignaPages.HomePageIgna;
import ignaPages.LoginPageIgna;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

    public WebDriver driver;

    @Test
    public void LoginTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Home page
        HomePageIgna home = new HomePageIgna(driver);
        home.goToHomePage();
        // home.closeCookiesIfPresent();
        home.clickContulMeu();

        //Login page
        LoginPageIgna login = new LoginPageIgna(driver);
        login.enterEmail();
        login.enterPassword();
        login.rememberElement();
        login.loginButton();

        driver.quit();
    }
}
