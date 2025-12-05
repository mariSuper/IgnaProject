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

        HomePageIgna homePage = new HomePageIgna(driver);
        homePage.goToHomePage();

        ProductPageIgna productPage = new ProductPageIgna(driver);

        productPage.clickProduse();
        productPage.openFagureMunte();
        productPage.addToCart();

        productPage.returnToHomePage();

        productPage.openMiereScortisoara();
        productPage.addToCart();

        productPage.clickVeziCos();
        productPage.clickRemoveProduct();

        driver.quit();
    }
}


