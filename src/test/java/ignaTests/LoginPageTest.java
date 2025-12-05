package ignaTests;
import ignaPages.HomePageIgna;
import ignaPages.LoginPageIgna;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePageIgna home = new HomePageIgna(driver);
        home.goToHomePage();
        home.clickContulMeu();

        LoginPageIgna login = new LoginPageIgna(driver);
        login.enterEmail();
        login.enterPassword();
        login.clickRememberMe();
        login.clickLoginButton();

        driver.quit();
    }
}
