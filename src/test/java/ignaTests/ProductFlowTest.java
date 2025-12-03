package ignaTests;
import ignaPages.HomePageIgna;
import ignaPages.ProductPageIgna;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductFlowTest {

    @Test
    public void productFlowTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Home page
        HomePageIgna homePage = new HomePageIgna(driver);
        homePage.goToHomePage();

        // Produse
        ProductPageIgna productPage = new ProductPageIgna(driver);
        productPage.clickproduseElement();
        productPage.openmiereScortisoara();
        productPage.addToCart();
        productPage.goBackToProductsPage();
        productPage.openfagureMunte();
        productPage.addToCart();
        productPage.clickVeziCos();
        productPage.clickstergeDinCos();

        // închide sesiunea
        driver.quit();

    }
}


