package sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    @Test
    public void dragDrop()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchi\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        driver.manage().window().maximize();
        WebElement img = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(img, box).build().perform();
        driver.quit();
    }
}
