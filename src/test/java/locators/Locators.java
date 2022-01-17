package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class Locators {
    @Test(groups = "Locators")
    public void locatorsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement startPage = driver.findElement(By.xpath("//*[text()='Geolocation']"));
        startPage.click();

        WebElement pageTitle = driver.findElement(By.xpath("//*[text()='Geolocation']"));

        WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        button.click();

        pageTitle.getText().contains("Latitude");

        driver.quit();
    }

    @Test(dependsOnGroups = "Locators")
    public void locatorTest1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement startPage = driver.findElement(By.xpath("//*[text()='Redirect Link']"));
        startPage.click();

        WebElement inside = driver.findElement(By.xpath("//*[text()='Redirection']"));
        WebElement link = driver.findElement(By.xpath("//*[@id='redirect']"));
        link.click();

        WebElement redirect = driver.findElement(By.xpath("//*[text()='Status Codes']"));
        redirect.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));
        redirect.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a"));
        redirect.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a"));
        redirect.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a"));

        Assert.assertTrue(redirect.isDisplayed());

        driver.quit();
    }

    @Test(dependsOnGroups = "Locators")
    public void locatorTest2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement startPage = driver.findElement(By.xpath("//*[text()='Form Authentication']"));
        startPage.click();

        WebElement authPage = driver.findElement(By.xpath("//*[text()='Login Page']"));
        Assert.assertTrue(authPage.getText().equals("Login Page"));

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.click();
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.click();
        password.sendKeys("SuperSecretPassword!");

        WebElement button = driver.findElement(By.cssSelector(".fa"));
        button.click();

        WebElement successPage = driver.findElement(By.xpath("//*[text()=' Secure Area']"));
        WebElement logout = driver.findElement(By.cssSelector(".icon-2x"));

        Assert.assertTrue(successPage.isDisplayed());
        Assert.assertTrue(logout.isDisplayed());

        driver.quit();
    }

    @Test(dependsOnGroups = "Locators")
    public void locatorTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement startPage = driver.findElement(By.xpath("//*[text()='Challenging DOM']"));
        startPage.click();

        WebElement dataPage = driver.findElement(By.xpath("//*[text()='Challenging DOM']"));
        Assert.assertTrue(dataPage.isDisplayed());

        WebElement column = driver.findElement(By.xpath("//*[text()='Action']"));
        Assert.assertTrue(column.isDisplayed());

        driver.quit();



    }
}
