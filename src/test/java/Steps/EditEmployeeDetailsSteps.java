package Steps;

import com.project.base.Base;
import com.project.pages.EditEmployeeDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class EditEmployeeDetailsSteps extends Base {

    EditEmployeeDetailsPage editEmployeeDetailsPage = new EditEmployeeDetailsPage();

    @Given("Click on the Employee field")
    public void clickOnTheEmployeeField() {
        editEmployeeDetailsPage.Click_Employee_field_Ele(webDriver).click();
    }


    @Then("Add Employee's License Number as {string}")
    public void addEmployeeSLicenseNumberAs(String license_number) {
        editEmployeeDetailsPage.Add_Employee_License_Number_Ele(webDriver).sendKeys(license_number);
    }

    @And("Add License Expiry Date as {string}")
    public void addLicenseExpiryDateAs(String license_expiry_date) {
        editEmployeeDetailsPage.Add_License_Expiry_Date_Ele(webDriver).sendKeys(license_expiry_date);
    }

    @And("Select the Nationality")
    public void selectTheNationality() {

            Actions act = new Actions(webDriver);
            editEmployeeDetailsPage.Click_Nationality_Ele(webDriver).click();
            boolean found = false;
            while (!found) {
                act.sendKeys(Keys.ARROW_DOWN).perform();
                String targetLocator = editEmployeeDetailsPage.Select_Nationality_Ele(webDriver).getText();
                if (targetLocator.contains("Egyptian")) {
                    found = true;
                    act.sendKeys(Keys.ENTER).perform();
                }
            }
        }


    @And("Select the Marital Status")
    public void selectTheMaritalStatus() {

        Actions act = new Actions(webDriver);
        editEmployeeDetailsPage.Click_Martial_Status_Ele(webDriver).click();
        boolean found = false;
        while (!found) {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            String targetLocator = editEmployeeDetailsPage.Select_Martial_Status_Ele(webDriver).getText();
            if (targetLocator.contains("Single")) {
                found = true;
                act.sendKeys(Keys.ENTER).perform();
            }
        }
    }


    @And("Add Date of Birth as {string}")
    public void addDateOfBirthAs(String date_of_birth) {
        editEmployeeDetailsPage.Add_Date_of_Birth_Ele(webDriver).sendKeys(date_of_birth);
    }

    @And("select the Gender")
    public void selectTheGender() {
        editEmployeeDetailsPage.Select_Gender_Ele(webDriver).click();
    }

    @Then("Click on the Save button")
    public void clickOnTheSaveButton() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2));
        editEmployeeDetailsPage.Click_Save_Ele(webDriver).click();
    }



}
