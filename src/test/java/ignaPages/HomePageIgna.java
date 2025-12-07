package ignaPages;
import ignaUtils.LoggerUtil;
import methodsIgna.ElementsMethod;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageIgna {

    private WebDriver driver;
    private ElementsMethod elementsMethod;
    private Logger logger = LoggerUtil.getLogger(HomePageIgna.class);

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
        logger.info("Deschid pagina de login");
        elementsMethod.click(contulMeu);
        }
    }

