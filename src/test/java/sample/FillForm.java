package sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class FillForm {

    @Test
    public void form() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchi\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("sanchita");
        driver.findElement(By.id("last-name")).sendKeys("harne");
        driver.findElement(By.id("job-title")).sendKeys("qa engineer");
        driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
        driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
        Select select = new Select(driver.findElement(By.id("select-menu")));
        select.selectByIndex(3);
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("05/02/2023");
        driver.findElement(By.cssSelector("#datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));

        String alertText = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        assertEquals("The form was successfully submitted!", alertText);
        driver.quit();
    }
}
