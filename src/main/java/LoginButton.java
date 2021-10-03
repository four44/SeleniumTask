import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginButton extends BasePage{

    By goToLogin = By.id("header-user-section");
    By LoginBtnLocator = By.id("loginLink");

    public LoginButton(WebDriver driver) {
        super(driver);
    }

    public void login(){
        click(goToLogin);

    }

    public boolean isOnLoginPage() {
       return isDisplayed(LoginBtnLocator);
    }
}
