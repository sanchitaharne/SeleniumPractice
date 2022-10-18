package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {

    @Test
    public void testCheckbox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.manage().window().maximize();
        WebElement chkBox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        chkBox1.click();
        WebElement chkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        chkBox2.click();
        driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
        driver.quit();
    }

}
