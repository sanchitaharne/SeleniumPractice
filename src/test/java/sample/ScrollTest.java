package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTest {

    @Test
    public void testScroll() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        element.sendKeys("Sanchita Harne");
        element = driver.findElement(By.id("date"));
        element.sendKeys("01/01/2023");
        Thread.sleep(2000);
        driver.quit();

    }
}
