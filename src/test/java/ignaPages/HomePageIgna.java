package ignaPages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePageIgna {

    public WebDriver driver;
    public WebDriverWait wait;

    public HomePageIgna(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void goToHomePage() {
        driver.get("https://stupinaigna.ro/");
    }
//    public void closeCookiesIfPresent() {
//        try {
//            WebElement cookiesBtn = wait.until(
//                    ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Accept')]")));
//            cookiesBtn.click();
//        } catch (Exception e) {
//            // dacă nu apare, mergem mai departe
//            System.out.println("Cookies popup not displayed.");
//        }
//    }
    public void acceptCookies() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement acceptBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[contains(text(),'Accept')]")));
            acceptBtn.click();
            System.out.println("Cookies popup accepted.");
        } catch (Exception e) {
            System.out.println("Cookies popup not displayed.");
        }
    }

    public void clickAcasa() {
        WebElement acasaElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[@href='/']")));
        acasaElement.click();
    }

    public void clickContulMeu() {
        WebElement contElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(@href, 'contul-meu')]")));

        // Click normal sau fallback JS dacă e blocat
        try {
            contElement.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", contElement);
        }
    }
}