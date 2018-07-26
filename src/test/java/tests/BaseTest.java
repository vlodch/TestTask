package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    static ChromeDriver driver;

    @BeforeClass
    public static void initEnv() {
        System.setProperty("webdriver.chrome.driver", "{user.dir}\\src\\main\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @SuppressWarnings("unchecked")
    protected boolean waitForElement(WebDriver driver, long timeout, ExpectedCondition<? extends SearchContext>... isTrueArray) {
        if (timeout > 0 && isTrueArray != null && isTrueArray.length > 0) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            for (ExpectedCondition<? extends SearchContext> isTrue : isTrueArray) {
                wait.until(isTrue);
            }

            return true;
        } else {
            return false;
        }
    }

}
