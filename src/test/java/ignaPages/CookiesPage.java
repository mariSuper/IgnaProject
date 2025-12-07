package ignaPages;
import methodsIgna.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPage {

    private WebDriver driver;
    private ElementsMethod elementsMethod;

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
            System.out.println("Banner cookies nu este prezent.");
        }
    }
}