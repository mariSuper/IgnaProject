package ignaPages;
import ignaUtils.LoggerUtil;
import methodsIgna.ElementsMethod;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageIgna {

    private WebDriver driver;
    private ElementsMethod elementsMethod;
    private Logger logger = LoggerUtil.getLogger(ProductPageIgna.class);

    public ProductPageIgna(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(driver, this);
    }

    // Buton Meniu "PRODUSE"
    @FindBy(xpath = "//a[contains(@href, 'magazin')]")
    private WebElement butonProduse;

    // Produs în interiorul PRODUSE: Fagure Munte
    @FindBy(xpath = "//a[contains(@href, 'fagure-de-miere-munte')]")
    private WebElement produsFagureMunte;

    // Produs pe homepage: Miere cu scorțișoară
    @FindBy(xpath = "//a[contains(@href, 'miere-cu-scortisoara')]")
    private WebElement produsMiereScortisoara;

    // Buton "Adaugă în coș"
    @FindBy(name = "add-to-cart")
    private WebElement butonAddToCart;

    // Buton Vezi coș
    @FindBy(xpath = "//a[contains(@href, 'cart')]")
    private WebElement butonVeziCos;

    // Buton Remove Product
    @FindBy(xpath = "//a[contains(@href, 'remove')]")
    private WebElement butonRemove;

    // Metode
    public void clickProduse() {
        logger.info("Deschid meniul PRODUSE");
        elementsMethod.click(butonProduse);
    }

    public void openFagureMunte() {
        logger.info("Deschid produsul Fagure Munte");
        elementsMethod.javaScriptClick(produsFagureMunte);
    }

    public void addToCart() {
        logger.info("Adaug produsul în coș");
        elementsMethod.javaScriptClick(butonAddToCart);
    }

    public void returnToHomePage() {
        logger.info("Return to Home Page");
        driver.navigate().back();
    }

    public void openMiereScortisoara() {
        logger.info("Deschid Miere cu Scortisoara");
            elementsMethod.javaScriptClick(produsMiereScortisoara);
    }

    public void clickVeziCos() {
        logger.info("Deschid coșul");
        elementsMethod.javaScriptClick(butonVeziCos);
    }

    public void clickRemoveProduct() {
        logger.info("Șterg produsul din coș");
        elementsMethod.javaScriptClick(butonRemove);
    }
}



