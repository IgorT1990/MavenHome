package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

//    private final By usernameBy = By.id("username");
//    private final By passwordBy = By.id("password");
//    private final By loginButtonBy = By.cssSelector("button[type='submit']");

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(css = ".flach.error")
    private WebElement errorAlert;

    public LoginPage(WebDriver driver){
      super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String username){
        userNameInput.sendKeys("username");
    }

    public LoginPage setPassword(String password){
        passwordInput.sendKeys("password");
    }
    public SecurePage clickLoginButton(){
        clickButton(loginButton);
        return new SecurePage(driver);
    }

    public SecurePage login(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
//        this.clickLoginButton();
        return this.clickLoginButton();
    }

    public String getErrorMessage(){
        return errorAlert.getText();
    }


}
