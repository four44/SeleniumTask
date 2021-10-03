import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage  extends BasePage{

    By inBasketLocator = new By.ByCssSelector("div.rd-cart-item.shoppingcart-item");
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkBasket() {
        return getProducts().size()>0;
    }

    private List<WebElement> getProducts(){
        return findall(inBasketLocator);
    }
}
