package ignaPages;
import ignaUtils.LoggerUtil;
import methodsIgna.ElementsMethod;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIgna {

    private WebDriver driver;
    private ElementsMethod elementsMethod;
    private Logger logger = LoggerUtil.getLogger(LoginPageIgna.class);

    public LoginPageIgna(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "rememberme")
    private WebElement rememberMe;

    @FindBy(name = "login")
    private WebElement loginButton;

    // Login to Account
    public void loginToAccount(String email, String pass) {
        logger.info("Introduc emailul");
        elementsMethod.fill(emailInput, email);

        logger.info("Introduc parola");
        elementsMethod.fill(passwordInput, pass);

        logger.info("Bifez Remember Me");
        elementsMethod.click(rememberMe);

        logger.info("Apas Login");
        elementsMethod.click(loginButton);

    }
}