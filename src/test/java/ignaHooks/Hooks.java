package ignaHooks;
import ignaPages.CookiesPage;
import ignaUtils.LoggerUtil;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    protected WebDriver driver;
    private Logger logger = LoggerUtil.getLogger(Hooks.class);

    @BeforeMethod
    public void setup() {

        logger.info("Pornesc browserul Chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        logger.info("Deschid site-ul");
        driver.get("https://stupinaigna.ro/");

        // Accept cookies
        CookiesPage cookies = new CookiesPage(driver);
        cookies.acceptCookiesIfPresent();
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Inchid browserul Chrome");
        if (driver != null) {
            driver.quit();
        }
    }
}

