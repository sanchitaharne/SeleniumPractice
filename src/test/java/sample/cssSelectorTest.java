package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTest {

    @Test
    public void testCssSelector() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Page Scroll")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".navbar-brand")).click();
        driver.findElement(By.linkText("Enabled and disabled elements")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#input")).click();

}}
