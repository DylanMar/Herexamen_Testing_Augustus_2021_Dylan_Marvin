package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.Page;

public class OverviewTimeslotsSteps {

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

    @Given("There are timeslots to choose from")
    public void thereAreTimeslotsToChooseFrom() {
    }


    @When("“Frederik” wants a list of all available timeslots")
    public void frederikWantsAListOfAllAvailableTimeslots() {

    }

    @Then("“Frederik” gets notified that the registration period is closed")
    public void frederikGetsNotifiedThatTheRegistrationPeriodIsClosed() {

    }

    @Then("“Frederik” gets notified that there are no timeslots available")
    public void frederikGetsNotifiedThatThereAreNoTimeslotsAvailable() {

    }

    @Then("“Frederik” gets a list of all available timeslots")
    public void frederikGetsAListOfAllAvailableTimeslots() {

    }

    @Then("“Frederik” gets notified that he already reached his maximum amount of appointments in this event")
    public void frederikGetsNotifiedThatHeAlreadyReachedHisMaximumAmountOfAppointmentsInThisEvent() {

    }
}