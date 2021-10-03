import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BtnClicked extends BasePage{

    By loginbtnLocator = By.id("loginLink");
    By loginCheckLocator = By.id("menuUserIcon");
    public BtnClicked(WebDriver driver) {
        super(driver);
    }

    public void loginClicked() {
        click(loginbtnLocator);

    }

    public boolean loginCheck() {
       return isDisplayed(loginCheckLocator);
    }
}
