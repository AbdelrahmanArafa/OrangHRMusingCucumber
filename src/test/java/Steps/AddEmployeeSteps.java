package Steps;

import com.project.base.Base;
import com.project.pages.AddEmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.time.Duration;


public class AddEmployeeSteps extends Base {

    AddEmployeePage addEmployeePage = new AddEmployeePage();


    @Given("Admin opens the Dashboard page")
    public void adminOpensTheDashboardPage() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }


    @When("Clicking on PIM")
    public void clickingOnPIM() {
        addEmployeePage.Click_PIM_Ele(webDriver).click();
    }

    @And("Clicking on Add Button")
    public void clickingOnAddButton() {
        addEmployeePage.Click_Add_Button_Ele(webDriver).click();
    }

    @Then("Fills the Employee's First name as {string} and Middle Name as {string} and Last Name as {string}")
    public void fillsTheEmployeeSFirstNameAsAndMiddleNameAsAndLastNameAsAndIDAs(String firstname, String middlename, String lastname) {
        addEmployeePage.Fill_Employee_FirstName_Ele(webDriver).sendKeys(firstname);
        addEmployeePage.Fill_Employee_MiddleName_Ele(webDriver).sendKeys(middlename);
        addEmployeePage.Fill_Employee_LastName_Ele(webDriver).sendKeys(lastname);
    }

    @Then("Click on Save button")
    public void clickOnSaveButton() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        addEmployeePage.Click_Save_Button_Ele(webDriver).click();
        Thread.sleep(Duration.ofSeconds(3));

    }



}
