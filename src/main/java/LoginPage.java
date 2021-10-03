import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By EmailInput = By.id("LoginEmail");
    By PasswordInput = By.id("Password");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Email(String text) {
        type(EmailInput, text);

    }

    public void Password(String text) {
        type(PasswordInput, text);
    }
}
