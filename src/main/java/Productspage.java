import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Productspage extends BasePage {

    By filter = By.id("Filtre");
    By productSelecter = By.id("model_1799958_5180047");

    public Productspage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductpage() {
        return isDisplayed(filter);
    }

    public void selectProduct(int i) {
        listAllProducts().get(i).click();
    }

    private List<WebElement> listAllProducts(){
        return findall(productSelecter);
    }
}
