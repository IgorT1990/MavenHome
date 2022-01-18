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

public class DragAndDrop {
    private WebDriver driver;

    @BeforeClass
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void dragAndDrop(){
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement startPage = driver.findElement(By.cssSelector("body > h1"));
        Assert.assertTrue(startPage.isDisplayed());

        WebElement box = driver.findElement(By.xpath("//*[@id='draggable']"));
        Assert.assertTrue(box.getText().contains("Drag me to my target"));

        WebElement area = driver.findElement(By.xpath("//*[@id='droppable']"));
        Assert.assertTrue(area.getText().contains("Drop here"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(box).dragAndDrop(box, area).perform();

        Assert.assertTrue(area.getText().contains("Dropped!"));
    }

    @AfterClass
    public void finish(){
    driver.quit();
    }

}
