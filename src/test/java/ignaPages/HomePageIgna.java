package ignaPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageIgna {

    public WebDriver driver;

    @Test
    public void Acasa() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stupinaigna.ro/");
    }
    public void clickAcasa() {
        WebElement acasaElement = driver.findElement(By.xpath("//a[@href='/']"));
        acasaElement.click();
    }

    public void clickContulMeu() {
        WebElement contElement = driver.findElement(By.xpath("//a[contains(@href, 'contul-meu')]"));
        contElement.click();
    }
}
