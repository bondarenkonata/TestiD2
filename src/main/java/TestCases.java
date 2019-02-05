import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;




public class TestCases {

    public String url ="http://www.google.com/";
    public WebDriver driver;


    @BeforeMethod
    public void StartDriver(){
        System.setProperty("webdriver.chrome.driver", "D:\\CDP\\Tools for Web App\\TestiD\\src\\main\\resources\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(url);
           }

    @Test

    public void VerifilogoIsDisplayed(){

        driver.manage().window().maximize();
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        assertTrue((logo.isDisplayed()));
    }
    @Test

    public void VerifyHomePage() {
        driver.manage().window().maximize();
        Assert.assertEquals("Google", driver.getTitle());

    }
    @Test

    public void CheckResultOfSearchIsPresent() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String Actualtext = driver.findElement(By.id("resultStats")).getText();
        assertTrue(Actualtext.contains("Приблизна кількість результатів:"));

    }

    @Test

    public void VerifyButtonIsDisplayed() {

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        WebElement button = driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(button.isDisplayed());

                   }


    @AfterMethod
    public void CloseDriver() {
       driver.close();

    }
}
