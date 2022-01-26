package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePage extends BaseClass {
    private final By successBy = By.cssSelector(".flash.success");
    private final By buttonBy = By.cssSelector(".button.secondary.radius");

    public SecurePage(WebDriver driver){
        super(driver);
    }

    public String getSuccessText(String string){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(successBy)).getText();
    }

    public LoginPage clickLogout(){
        this.driver.findElement(buttonBy).click();
        return new LoginPage(driver);
    }
}
