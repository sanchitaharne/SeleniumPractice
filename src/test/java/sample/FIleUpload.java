package sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUpload {
    @Test
    public void fileUploadTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanchi\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.id("file-upload-field"));
        upload.sendKeys("file-to-upload.png");
    }

}
