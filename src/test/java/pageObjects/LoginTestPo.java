package pageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTestPo extends BaseTest {

    @Test
    public void loginTest(){

            SecurePage securePage = openApp().goToLoginPage().setUsername("tomsmith").setPassword("SuperSecretPassword").clickLoginButton();
            String successText = securePage.getSuccessText("You logged into a secure area!");
            securePage.clickLogout();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.setUsername("tomsmith");
//        loginPage.setPassword("SuperSecretPassword");
//        loginPage.clickLoginButton();
//
//        SecurePage securePage = new SecurePage(driver);
//        String success = securePage.getSuccessText();

        Assert.assertTrue(successText.contains("You logged into a secure area!"));
    }





}
