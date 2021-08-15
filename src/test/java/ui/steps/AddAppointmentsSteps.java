package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.Page;


public class AddAppointmentsSteps {

    private WebDriver driver;
    private String path = "http://localhost:8080/Controller";

    private Page currentPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dylan\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.get(path+"?command=DeleteAll");
        driver.quit();
    }

    @Given("There are locations to choose from")
    public void thereAreLocationsToChooseFrom() {

    }

    @When("“Frederik” wants to make an appointment")
    public void frederikWantsToMakeAnAppointment() {

    }

    @Then("“Frederik” gets notified that he should pick a location that is available")
    public void frederikGetsNotifiedThatHeShouldPickALocationThatIsAvailable() {

    }

    @Then("“Frederik” gets notified that the appointment has been made")
    public void frederikGetsNotifiedThatTheAppointmentHasBeenMade() {

    }

    @Then("“Frederik” gets notified that he should specify a location")
    public void frederikGetsNotifiedThatHeShouldSpecifyALocation() {

    }

    @Given("There must be a maximum amount of enlistings")
    public void thereMustBeAMaximumAmountOfEnlistings() {

    }

    @Then("“Frederik” gets notified that he should specify a maximum amount of enlistings")
    public void frederikGetsNotifiedThatHeShouldSpecifyAMaximumAmountOfEnlistings() {

    }

    @Then("“Frederik” gets notified that he should specify a positive number as the maximum amount of enlistings")
    public void frederikGetsNotifiedThatHeShouldSpecifyAPositiveNumberAsTheMaximumAmountOfEnlistings() {

    }

    @Given("There must be an available timeslot")
    public void thereMustBeAnAvailableTimeslot() {

    }

    @Then("“Frederik” gets notified that he should specify an available timeslot")
    public void frederikGetsNotifiedThatHeShouldSpecifyAnAvailableTimeslot() {

    }
}