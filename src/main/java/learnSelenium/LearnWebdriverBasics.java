package learnSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LearnWebdriverBasics {

    static WebDriver driver;
    static WebDriverWait wait;
    final String  URL = "https://sephora.com";

   String path = System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe";

    @Before
    public void driverInit(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @Test
    public void testEyeLiner(){
        WebDriverWait wait = new WebDriverWait(driver, 17);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("site_search_input"))));
        WebElement searchInputBox = driver.findElement(By.id("site_search_input"));
        searchInputBox.sendKeys("eyeliner");
        searchInputBox.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@data-at='number_of_products']"))));

        String searchResults = (driver.findElement(By.xpath("//p[@data-at='number_of_products']"))).getText();
        Assert.assertEquals(searchResults, "169 Results for “eyeliner”");
    }
}
