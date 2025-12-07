package ignaPages;
import ignaUtils.LoggerUtil;
import methodsIgna.ElementsMethod;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPage {

    private WebDriver driver;
    private ElementsMethod elementsMethod;
    private Logger logger = LoggerUtil.getLogger(CookiesPage.class);

    public CookiesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(driver, this);
    }

    // Buton Accept cookies
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;

    // Metodă simplă, încearcă să dea click dacă banner-ul există
    public void acceptCookiesIfPresent() {
        try {
            elementsMethod.javaScriptClick(acceptCookiesButton);
            System.out.println("Cookies acceptate.");
        } catch (Exception e) {
            System.out.println("Nu apare bannerul de cookies.");
        }
    }
}