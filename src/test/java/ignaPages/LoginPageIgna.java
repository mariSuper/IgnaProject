package ignaPages;
import methodsIgna.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIgna {

    private WebDriver driver;
    private ElementsMethod elementsMethod;

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

    // Metodă de completare email
    public void typeEmail(String email) {
        elementsMethod.fill(emailInput, email);
    }

    // Metodă de completare parola
    public void typePassword(String password) {
        elementsMethod.fill(passwordInput, password);
    }

    // Metodă click Remember Me
    public void clickRememberMe() {
        elementsMethod.javaScriptClick(rememberMe);
    }

    // Metodă click Login
    public void clickLoginButton() {
        elementsMethod.click(loginButton);
    }
}