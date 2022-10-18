package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.annotation.Target;

public class KeyboardMouseInput {

    @Test
    public void keyboardMouse(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("name"));
        element.sendKeys("sanchita");
        element = driver.findElement(By.id("button"));
        element.click();
        driver.quit();
    }
}
