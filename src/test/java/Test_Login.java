import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

//Login ekranı ve process-test
public class Test_Login extends BaseTest{

    Homepage homepage;
    LoginButton loginButton;
    LoginPage loginPage;
    BtnClicked btnClicked;


    //"giriş yap" on navigator
    @Test
    @Order(1)
    public void goLogin(){
        homepage = new Homepage(driver);
        loginButton = new LoginButton(driver);
        loginButton.login();
        Assertions.assertTrue(loginButton.isOnLoginPage(), "Not  on Login  page");

    }
    @Test
    @Order(2)
    public void enterEmail(){
        loginPage = new LoginPage(driver);
        loginPage.Email("ern.shn1@gmail.com");


    }
    @Test
    @Order(3)
    public void enterPassword(){
        loginPage.Password("654321snp");
    }

    @Test
    @Order(4)
    public void clickLogin(){
        btnClicked.loginClicked();
        Assertions.assertTrue(btnClicked.loginCheck(), "Login Process Failed");

    }
}
