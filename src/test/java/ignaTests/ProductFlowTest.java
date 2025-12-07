package ignaTests;
import ignaHooks.Hooks;
import ignaPages.HomePageIgna;
import ignaPages.ProductPageIgna;
import org.testng.annotations.Test;

public class ProductFlowTest extends Hooks {

    @Test
    public void productFlowTest() {

        HomePageIgna homePage = new HomePageIgna(driver);

        ProductPageIgna productPage = new ProductPageIgna(driver);

        productPage.clickProduse();
        productPage.openFagureMunte();
        productPage.addToCart();

        productPage.returnToHomePage();

        productPage.openMiereScortisoara();
        productPage.addToCart();

        productPage.clickVeziCos();
        productPage.clickRemoveProduct();
    }
}

