package flights.Zadanie2;

import codersGuru.zadanie1.RegisterPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reservation {
    WebDriver driver;

    public void ClickClearSend(WebElement element, String text)
    {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.phptravels.net");
    }

    @Test
    public void TestReservation()
    {
        @FindBy(xpath = "/html/body/div[20]/div/input")
        WebElement departure;

        @FindBy(className = "text-center")
                WebElement flightsButton;

        @FindBy(xpath = "/html/body/div[20]/div/input")
                WebElement destination;

        @FindBy()



    }
    @After
    public void teardown(){};
}
