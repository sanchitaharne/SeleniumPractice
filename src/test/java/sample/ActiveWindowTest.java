package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActiveWindowTest {

    @Test
    public void testWindows(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("new-tab-button"));
        element.click();

        String originalHandle = driver.getWindowHandle();
        for(String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }

        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
