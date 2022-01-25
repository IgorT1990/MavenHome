package waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsTestSelectFromDropdown {
    private WebDriver driver;
    private Actions actions;
    private WebDriverWait webDriverWait;

    @BeforeClass
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void selectData(){
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, 'collapse navbar-collapse')]")));

        WebElement startPage = driver.findElement(By.xpath("//*[text()='Home Page']"));
        Assert.assertTrue(startPage.getText().contains("Home Page"));

        WebElement dropdown = driver.findElement(By.cssSelector(".nav :nth-of-type(3)"));
        actions.click(dropdown).perform();

        WebElement dropdownMenu = driver.findElement(By.cssSelector(".dropdown > ul:nth-child(2)"));
        actions.moveToElement(dropdownMenu).perform();

        WebElement secondaryMenu = driver.findElement(By.cssSelector(".secondary-dropdown > a:nth-child(1)"));
        actions.moveToElement(secondaryMenu).perform();

        WebElement secondaryAction = driver.findElement(By.cssSelector(".secondary > li:nth-child(1) > a:nth-child(1)"));
        actions.moveToElement(secondaryAction).click().perform();

        WebElement successPage = driver.findElement(By.cssSelector(".secondary-clicked h1"));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, 'jumbotron secondary-clicked')]")));
        Assert.assertTrue(successPage.getText().contains("Secondary Page"));


    }

    @AfterClass
    public void finish(){
        driver.quit();
    }
}

