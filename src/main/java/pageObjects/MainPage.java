package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BaseClass {
    private final By linkTextBy = By.linkText("Form Authentication");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(linkTextBy).click();

        return new LoginPage(driver);
    }
}
