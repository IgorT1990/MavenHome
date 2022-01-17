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

public class UserName {

    private WebDriver driver;

    @BeforeClass
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void userData(){
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement startPage = driver.findElement(By.cssSelector(".example h3"));
        Assert.assertTrue(startPage.getText().contains("Hovers"));

        WebElement avatar1 = driver.findElement(By.cssSelector(".figure:nth-child(3) img:nth-child(1)"));
        Assert.assertTrue(avatar1.isDisplayed());

        WebElement avatar2 = driver.findElement(By.cssSelector(".figure:nth-child(4) img:nth-child(1)"));
        Assert.assertTrue(avatar2.isDisplayed());

        WebElement avatar3 = driver.findElement(By.cssSelector(".figure:nth-child(5) img:nth-child(1)"));
        Assert.assertTrue(avatar3.isDisplayed());

        Actions actions = new Actions(driver);

        actions.moveToElement(avatar1).perform();
        WebElement name1 = driver.findElement(By.cssSelector(".figure:nth-child(3) :nth-child(2) h5:nth-child(1)"));
        Assert.assertTrue(name1.getText().contains("user1"));

        actions.moveToElement(avatar2).perform();
        WebElement name2 = driver.findElement(By.cssSelector(".figure:nth-child(4) :nth-child(2) h5:nth-child(1)"));
        Assert.assertTrue(name2.getText().contains("user2"));

        actions.moveToElement(avatar3).perform();
        WebElement name3 = driver.findElement(By.cssSelector(".figure:nth-child(5) :nth-child(2) h5:nth-child(1)"));
        Assert.assertTrue(name3.getText().contains("user3"));



    }

    @AfterClass
    public void finish(){
        driver.quit();
    }
}
