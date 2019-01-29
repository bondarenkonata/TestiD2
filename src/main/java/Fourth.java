import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.testng.Assert.assertTrue;

public class Fourth {


    public static final String url = "http://www.google.com/";

    @Test

    public void CheckSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\CDP\\Tools for Web App\\TestiD\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        driver.findElement(By.id("resultStats")).getText();
        assertTrue(true, "resultStats");
        Thread.sleep(5000);
        driver.quit();
    }

}




