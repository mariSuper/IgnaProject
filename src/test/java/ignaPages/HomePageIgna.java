package ignaPages;
import methodsIgna.ElementsMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageIgna {

    private WebDriver driver;
    private ElementsMethod elementsMethod;

    public HomePageIgna(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Acasă']")
    private WebElement butonAcasa;

    @FindBy(xpath = "//a[text()='Contul meu']")
    private WebElement contulMeu;

    public void clickAcasa() {
        elementsMethod.click(butonAcasa);
    }

    public void clickContulMeu() {
        try {
            elementsMethod.click(contulMeu);
        } catch (Exception e) {
            elementsMethod.javaScriptClick(contulMeu);
        }
    }
}