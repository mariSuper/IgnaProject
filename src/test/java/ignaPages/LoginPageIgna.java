package ignaPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginPageIgna {

    public WebDriver driver;

    @Test
    public void loginTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stupinaigna.ro/");

        // Așteptăm meniul (apare mereu înainte de contul meu)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-main-menu")));

       // Acum așteptăm linkul pentru Contul meu
        WebElement contElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@href, 'contul-meu')])[1]")));
       // Click cu fallback JS (trece peste animații și overlay -acolo pica Selenium)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", contElement);

        // Completez field-ul email
        WebElement emailElement = driver.findElement(By.xpath("//input[@id='username']"));
        emailElement.sendKeys("gabimari2022art@gmail.com");

        // Completez field-ul password
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
        passwordElement.sendKeys("Indexare1!");

        // Click pe elementul radiobuton
        WebElement rememberElement = driver.findElement(By.xpath("//input[@name='rememberme']"));
        rememberElement.click();

        // Click pe elementul Logare
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Autentificare')]"));
        loginButton.click();
    }
}
