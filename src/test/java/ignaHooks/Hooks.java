package ignaHooks;
import ignaPages.CookiesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stupinaigna.ro/");

        // Acceptam cookies imediat după ce se deschide site-ul
        CookiesPage cookies = new CookiesPage(driver);
        cookies.acceptCookiesIfPresent();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

