/*
package actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class RozetkaTest {
    private WebDriver driver;

    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    public void rozetka(){
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().fullscreen();
        WebElement catalog = driver.findElement(By.id("fat-menu"));
        catalog.click();

        WebElement menuItem = driver.findElement(By.cssSelector(".menu-categories li.menu-categories__item:nth-of-type(3)"));
        driver.manage().window().fullscreen();
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItem).perform();

        WebElement item = driver.findElement(By.xpath("//*[contains(@class, 'state_hovered')]//a[@class='menu__link menu__link_background_gray' and contains(text(), 'Видеокарты')]"));
        driver.manage().window().fullscreen();
        actions.moveToElement(item).click().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement filter1 = driver.findElement(By.xpath("//a[@data-id='Rozetka']//.."));
        driver.manage().window().fullscreen();
        actions.moveToElement(filter1).click().perform();

        setFilter("ASUS");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setFilter("GeForce RTX 3090");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> cards = driver.findElements(By.cssSelector(".catalog-grid__cell:nth-of-type(1)"));
        WebElement element = cards.stream().filter(card -> !card.findElement(By.cssSelector(".goods-tile__availability")).getText().equals("Нет в наличии")).findFirst().get();

        actions.moveToElement(element).perform();

        List<WebElement> descItems = element.findElements(By.cssSelector(".good-tile__description-item"));

        descItems.forEach(descItem -> {
            System.out.print(descItem.findElement(By.tagName("span")) + " - ");
            System.out.println(descItem.findElement(By.tagName("a")));
        });

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true)", cards);
        executor.executeScript("arguments[0].click()", cards);
    }

    public void close(){driver.quit();}
    private void setFilter(String id){
    driver.findElements(By.xpath("//a[@data-id='" + id + "']//.."));
    driver.manage().window().fullscreen();
    }
}

*/
