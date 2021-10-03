import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Homepage extends BasePage{

    Searchbox searchbox;
    LoginButton login;
    By ProductCountLocator = By.id("spanCart");


    public Homepage(WebDriver driver) {
        super(driver);
        searchbox = new Searchbox(driver);
        login = new LoginButton(driver);
    }

    public Searchbox searchbox() {
        return this.searchbox;
    }

    public LoginButton login(){
        return this.login;
    }

    public boolean isProductionCountUp() {
        return getCount() > 0;

    }

    public void goToBasket() {
        click(ProductCountLocator);
    }

    private int getCount(){
        String count = find(ProductCountLocator).getText();
        return Integer.parseInt(count);
    }
}
