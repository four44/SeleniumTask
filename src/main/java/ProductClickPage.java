import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductClickPage extends BasePage {

    By addButtonLocator = By.id("pd_add_to_cart");

    public ProductClickPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductClickPage() {
        return isDisplayed(addButtonLocator);

    }

    public void addToCBasket() {
        click(addButtonLocator);
    }
}
