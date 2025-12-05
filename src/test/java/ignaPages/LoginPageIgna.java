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

    public void enterEmail() {
        elementsMethod.fill(emailInput, "gabimari2022art@gmail.com");
    }

    public void enterPassword() {
        elementsMethod.fill(passwordInput, "Indexare1!");
    }

    public void clickRememberMe() {
        elementsMethod.click(rememberMe);
    }

    public void clickLoginButton() {
        try {
            elementsMethod.click(loginButton);
        } catch (Exception e) {
            elementsMethod.javaScriptClick(loginButton);
        }
    }
}