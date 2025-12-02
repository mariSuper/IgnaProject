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

public class ProductPageIgna {

    public WebDriver driver;

    @Test
    public void productsTest() {
        driver = new ChromeDriver();

        //dezactivam reclamele (de iframe ads)
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //wait implicit (vegheaza asupra codului)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://stupinaigna.ro/");

        // Click pe meniul 'Produse'
        WebElement produseElement = driver.findElement(By.xpath("//a[contains(@href, 'magazin')]"));
        WebDriverWait waitExplicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitExplicit.until(ExpectedConditions.alertIsPresent());


        // Click pe produs Miere cu Scortisoara
        WebElement miereScortisoara = driver.findElement(By.xpath("//a[contains(@href, 'miere-cu-scortisoara')]"));
        js.executeScript("arguments[0].click();", miereScortisoara);

        // Click pe produs Fagure de Munte
        WebElement fagureMunte = driver.findElement(By.xpath("//a[contains(@href, 'fagure-de-miere-munte')]"));
        js.executeScript("arguments[0].click();", fagureMunte);

        // Adauga in cos
        WebElement addToCartButton = driver.findElement(By.name("add-to-cart"));
        js.executeScript("arguments[0].click();", addToCartButton);

        // Click pe Vezi Cos
        WebElement clickVeziCos = driver.findElement(By.xpath("//a[contains(@href, 'cart')]"));
        js.executeScript("arguments[0].click();", clickVeziCos);

        // Sterge produs din Cos
        WebElement stergeDinCos = driver.findElement(By.xpath("//a[contains(@href, 'remove')]"));
        js.executeScript("arguments[0].click();", stergeDinCos);
    }
}


