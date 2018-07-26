package tests;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import tests.utils.PropertyLoader;

import static org.assertj.core.api.Assertions.*;

public class LoginPopUpTests extends BaseTest {
    private HomePage homePage;
    private Actions action;
    private long timeout = Long.valueOf(PropertyLoader.loadProperty("webElementTimeout"));

    @Test
    public void checkIfLoginPopUpAppears() {
        homePage = homePage == null ? new HomePage(driver) : homePage;
        action = action == null ? new Actions(driver) : action;
        driver.get(PropertyLoader.loadProperty("vegas.url"));
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getMagnifierButton()));
        homePage.getMagnifierButton().click();
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getSearchInput()));
        homePage.getSearchInput().sendKeys("Mayfair Roulette");
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getMayfairRouletteIcon()));
        action.moveToElement(homePage.getMayfairRouletteIcon()).build().perform();
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getMayfairRouletteMoreButton()));
        homePage.getMayfairRouletteMoreButton().click();
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getPlayNowButton()));
        homePage.getPlayNowButton().click();
        waitForElement(driver, timeout, ExpectedConditions.elementToBeClickable(homePage.getLogiPopUp().getLoginPopUpFrame()));
        assertThat(homePage.getLogiPopUp().getLoginPopUpFrame()).as("Login pop up is present").isNotNull();
    }
}
