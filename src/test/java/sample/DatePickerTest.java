package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {


    @Test
    public void testDatePicker() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("03/03/2023");
        datepicker.sendKeys(Keys.RETURN);
    }
}
