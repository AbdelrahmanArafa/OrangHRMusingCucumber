package Steps;

import com.project.base.Base;
import com.project.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginSteps extends Base {
    LoginPage loginPage = new LoginPage();


    @Given("Admin opens the website and goes to the login page")
    public void admin_opens_the_website_and_goes_to_the_login_page() {
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @When("Admin fills in Invalid UserName as {string} and Invalid Password as {string} and clicks on login")
    public void admin_fills_in_Invalid_UserName_and_Invalid_Password_and_clicks_on_login(String username,String password) {
        loginPage.User_Name_Ele(webDriver).sendKeys(username);
        loginPage.Password_Ele(webDriver).sendKeys(password);
        loginPage.Login_Button_Ele(webDriver).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @Then("the error message should be displayed")
    public void the_error_message_should_be_displayed() {
        Assert.assertEquals("Error: The wrong credentials are passed!", loginPage.Error_Message_Ele(webDriver),"Invalid credentials");

    }


    @When("Admin fills in Empty UserName as {string} and Valid Password as {string} and clicks on login")
    public void admin_Fills_In_Empty_UserName_And_Valid_Password_And_Clicks_On_Login(String username, String password) {
        loginPage.User_Name_Ele(webDriver).sendKeys(username);
        loginPage.Password_Ele(webDriver).sendKeys(password);
        loginPage.Login_Button_Ele(webDriver).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("UserName Required Hint Should Displayed")
    public void username_Required_Hint_Should_Displayed() {
        Assert.assertEquals("Error: The Hint isn't Displayed!", loginPage.UserName_Required_Hint_Ele(webDriver),"Required");

    }


    @When("Admin fills in Valid UserName as {string} and Empty Password as {string} and clicks on login")
    public void admin_Fills_In_Valid_UserName_And_Empty_Password_And_Clicks_On_Login(String username, String password) {
        loginPage.User_Name_Ele(webDriver).sendKeys(username);
        loginPage.Password_Ele(webDriver).sendKeys(password);
        loginPage.Login_Button_Ele(webDriver).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @Then("Password Required Hint Should Displayed")
    public void password_Required_Hint_Should_Displayed() {
        Assert.assertEquals("Error: The Hint isn't Displayed!", loginPage.Password_Required_Hint_Ele(webDriver),"Required");
    }


    @Then("Admin fills in Valid UserName as {string} and Valid Password as {string} and clicks on login")
    public void admin_fills_in_Valid_UserName_and_Valid_Password_and_clicks_on_login(String username, String password) {
        loginPage.User_Name_Ele(webDriver).sendKeys(username);
        loginPage.Password_Ele(webDriver).sendKeys(password);
        loginPage.Login_Button_Ele(webDriver).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("Admin should navigate to the Dashboard page")
    public void admin_should_navigate_to_the_Dashboard_page() {
        Assert.assertEquals("Error: Can't see the Dashboard txt!", loginPage.Dashboard_Ele(webDriver),"Dashboard");
    }



}
