package ignaPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPageIgna {

    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    public  ProductPageIgna(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public void clickproduseElement() {
        WebElement produse = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'magazin')]")));
        produse.click();
    }

    public void openmiereScortisoara() {
        WebElement miere = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'miere-cu-scortisoara')]")));
        js.executeScript("arguments[0].click();", miere);
    }

    public void addToCart() {
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("add-to-cart")));
        js.executeScript("arguments[0].click();", addBtn);
    }

    public void goBackToProductsPage() {
        driver.navigate().back();
    }

    public void openfagureMunte() {
        WebElement fagure = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'fagure-de-miere-munte')]")));
        js.executeScript("arguments[0].click();", fagure);
    }

    public void clickVeziCos() {
        WebElement veziCos = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'cart')]")));
        js.executeScript("arguments[0].click();", veziCos);
    }

    public void clickstergeDinCos() {
        WebElement remove = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'remove')]")));
        js.executeScript("arguments[0].click();", remove);
    }
}



