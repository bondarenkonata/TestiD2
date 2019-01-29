import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.testng.Assert.assertTrue;

public class Second {
    public static final String url="http://www.google.com/";
    @Test

    public void CheckSite(){
        System.setProperty("webdriver.chrome.driver", "D:\\CDP\\Tools for Web App\\TestiD\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        assertTrue((logo.isDisplayed()));
        driver.close();
    }
}
