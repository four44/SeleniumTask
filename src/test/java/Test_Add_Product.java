import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


//login yapıldıktan sonraki process-test
public class Test_Add_Product extends BaseTest {

    Homepage homepage;
    Productspage productspage;
    ProductClickPage productClickPage;
    BasketPage basketPage;





    @Test
    @Order(5)
    public void search_product(){

        homepage = new Homepage(driver);
        productspage = new Productspage(driver);
        homepage.searchbox().search("pantolan");
        Assertions.assertTrue(productspage.isOnProductpage(), "Not on Products Page");

    }
    @Test
    @Order(6)
    public void select_product(){
        productClickPage = new ProductClickPage(driver);
        productspage.selectProduct(1);
        Assertions.assertTrue(productClickPage.isOnProductClickPage(), "Not on products clicked page");

    }
    @Test
    @Order(7)
    public void add_product(){
        productClickPage.addToCBasket();
        Assertions.assertTrue(homepage.isProductionCountUp(), "Product is not selected");

    }
    @Test
    @Order(8)
    public void check_basket(){
        basketPage = new BasketPage(driver);
        homepage.goToBasket();
        Assertions.assertTrue(basketPage.checkBasket(), "Product was not added to basket");

    }

}
