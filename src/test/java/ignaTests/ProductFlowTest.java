package ignaTests;
import ignaHooks.Hooks;
import ignaPages.ProductPageIgna;
import org.testng.annotations.Test;

public class ProductFlowTest extends Hooks {

    @Test
    public void productFlowTest() {
        ProductPageIgna product = new ProductPageIgna(driver);

        product.clickProduse();
        product.openFagureMunte();
        product.addToCart();

        driver.navigate().back();

        product.openMiereScortisoara();
        product.addToCart();

        product.clickVeziCos();
        product.clickRemoveProduct();
    }
}

