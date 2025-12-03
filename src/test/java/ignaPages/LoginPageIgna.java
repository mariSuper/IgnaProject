package ignaPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPageIgna {

    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPageIgna(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void enterEmail() {
        driver.findElement(By.id("username"))
                .sendKeys("gabimari2022art@gmail.com");
    }

    public void enterPassword() {
        driver.findElement(By.id("password"))
                .sendKeys("Indexare1!");
    }

    public void rememberElement() {
        driver.findElement(By.name("rememberme"))
                .click();
    }

    public void loginButton() {
        driver.findElement(By.xpath("//button[contains(text()," +
                        " 'Autentificare')]"))
                .click();
    }
}
