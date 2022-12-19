package learnSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@RunWith(Suite.class)
@Suite.SuiteClasses({LearnWebdriverBasics.class})
public class LearnRunnerClass {
//    String absPath = System.getProperty("user.dir");
//    String relativePath = "/resources/WebDrivers/Mac/chromedriver";
//    String windowsChromeDriverPath = absPath + relativePath;
//    String website = "https://courses.letskodeit.com/practice";
//    static ChromeDriver driver;
//    static WebDriverWait webDriverWait;
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", windowsChromeDriverPath);
//
//
//        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        driver.get(website);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }






}

