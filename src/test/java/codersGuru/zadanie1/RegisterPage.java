package codersGuru.zadanie1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(className ="main-page-top__email-input")
    WebElement userEmail;

    @FindBy(className ="link main-page-top__email-input-sent" )
    WebElement emailButton;

    public void goToRegisterPage(String email)
    {
        ClickClearSend(userEmail, email);
        emailButton.click();
    }

    @FindBy(id="person")
    WebElement privateUser;

    @FindBy(id="fos_user_registration_form_name")
    WebElement userName;

    @FindBy(id="fos_user_registration_form_lastname")
    WebElement userLastName;

    @FindBy(id="fos_user_registration_form_plainPassword_first")
    WebElement userPassword;

    @FindBy(id="fos_user_registration_form_plainPassword_second")
    WebElement repeatPassword;

    @FindBy(id="form_city")
    WebElement userCity;

    @FindBy(id="form_postal_code")
    WebElement userPostalCode;

    @FindBy(id="form_street")
    WebElement userStreet;

    @FindBy(id="form-number")
    WebElement userHouseNumber;

    @FindBy(className = "error")
    WebElement regulationsButton;

    @FindBy(id="register-submit-btn")
    WebElement registerButton;

    public void fillEmptyField(String name, String lastName, String password, String city, String postalCode, String street, String houseNumber )
    {
privateUser.click();
ClickClearSend(userName, name);
ClickClearSend(userLastName, lastName);
ClickClearSend(userPassword, password);
ClickClearSend(repeatPassword, password);
ClickClearSend(userCity, city);
ClickClearSend(userPostalCode, postalCode);
ClickClearSend(userStreet, street);
ClickClearSend(userHouseNumber, houseNumber);
 regulationsButton.click();
 registerButton.click();

    }

}
