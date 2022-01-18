package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SelectFromDropdown {
    private WebDriver driver;

    @BeforeClass
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void selectData(){
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        Actions actions = new Actions(driver);

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
        Assert.assertTrue(successPage.getText().contains("Secondary Page"));


    }

    @AfterClass
    public void finish(){
    driver.quit();
    }
}
