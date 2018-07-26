package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//button[@class='btn-search-magnifier']")
    private WebElement magnifierButton;
    @FindBy(xpath = "//input[@placeholder='Search for games...']")
    private WebElement searchInput;

    @FindBy(xpath = "(//div[@class='vegas-tile__cover tile-cover'])[1]")
    private WebElement mayfairRouletteIcon;
    @FindBy(xpath = "(//button[@class='o-btn tile-menu__button tile-menu__button--play'])[1]")
    private WebElement mayfairRouletteMoreButton;
    @FindBy(xpath = "//button[@class='o-btn o-btn--big']")
    private WebElement playNowButton;


    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public WebElement getMayfairRouletteMoreButton() {
        return mayfairRouletteMoreButton;
    }

    public WebElement getMayfairRouletteIcon() {
        return mayfairRouletteIcon;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getMagnifierButton() {
        return magnifierButton;
    }

    public WebElement getPlayNowButton() {
        return playNowButton;
    }

    public LoginPopUp getLogiPopUp() {
        return new LoginPopUp();
    }

    public class LoginPopUp {
        @FindBy(xpath = "//div[@class='login-component__wrapper']")
        private WebElement loginPopUpFrame;

        public WebElement getLoginPopUpFrame() {
            return loginPopUpFrame;
        }
    }
}
