import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchbox extends BasePage {

    By searchBoxLocater = By.id("search");
    By searchButton = new By.ByCssSelector("a.hs-search-button");
    public Searchbox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocater, text);
        click(searchButton);
    }
}
