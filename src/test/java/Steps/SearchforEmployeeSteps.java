package Steps;

import com.project.base.Base;
import com.project.pages.SearchforEmployeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;


public class SearchforEmployeeSteps extends Base {
    
    SearchforEmployeePage searchforEmployeePage = new SearchforEmployeePage();


    @Given("Admin opens the Employees list page")
    public void adminOpensTheEmployeesListPage() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2));
        searchforEmployeePage.Click_Employee_List_Ele(webDriver).click();
    }

    @When("Add the Employee Name")
    public void addTheEmployeeName() {
        searchforEmployeePage.Add_Employee_Name_Ele(webDriver).sendKeys("Abdelrahman");
    }

    @Then("Click on Search Button")
    public void clickOnSearchButton() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        searchforEmployeePage.Click_Search_Button_Ele(webDriver).click();
        Thread.sleep(Duration.ofSeconds(1));
    }


}
