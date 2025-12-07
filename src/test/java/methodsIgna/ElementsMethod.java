package methodsIgna;
import ignaUtils.LoggerUtil;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementsMethod {

    private WebDriver driver;
    private WebDriverWait wait;
    private Logger logger = LoggerUtil.getLogger(ElementsMethod.class);

    public ElementsMethod(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void waitClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    private void waitVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        logger.info("Click normal pe element.");
        waitClickable(element);
        element.click();
    }

    public void fill(WebElement element, String text) {
        logger.info("Scriu textul: " + text);
        waitVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public void javaScriptClick(WebElement element) {
        logger.info("Click JS pe element.");
        waitClickable(element);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}


