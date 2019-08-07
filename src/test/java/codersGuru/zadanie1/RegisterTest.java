package codersGuru.zadanie1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterTest {

        WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.gecko.driver",
                    "src/test/resources/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://www.tester.codersguru.com");
        }

        @Test
        public void TestRegister()
        {
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.goToRegisterPage("nospanufyo@desoz.com");
            registerPage.fillEmptyField("Jan", "kowalski", "haslo", "city", "88-888", "street", "880");

        }
        @After
        public void teardown(){};

    }


