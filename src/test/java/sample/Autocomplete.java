package sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

    @Test
    public void autocomplete() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchi\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().window().maximize();
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(10000);
        driver.quit();
    }
}
