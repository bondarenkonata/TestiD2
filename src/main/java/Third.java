import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class Third {

    public static final String url="http://www.google.com/";
    @Test

    public void CheckSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\CDP\\Tools for Web App\\TestiD\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[2]/div[2]"));/*search element in input field (voice search)*/
        assertTrue((searchBox.isDisplayed()));
        Thread.sleep(5000);
        driver.quit();

    }

}
