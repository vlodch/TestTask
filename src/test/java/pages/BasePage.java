package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


    private ChromeDriver driver;
    public static Logger log = Logger.getLogger(BasePage.class);

    public BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
