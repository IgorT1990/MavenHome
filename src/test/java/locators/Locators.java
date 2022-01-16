package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Locators {
    @Test
    public void locatorsTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement data = driver.findElement(By.xpath("//*[text()='Geolocation']"));
        data.click();

        WebElement pageTitle = driver.findElement(By.xpath("//*[text()='Geolocation']"));

        WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        button.click();

        pageTitle.getText().contains("Latitude");

        driver.quit();
    }
    @Test
    public void locatorTest1(){
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
    }
}
