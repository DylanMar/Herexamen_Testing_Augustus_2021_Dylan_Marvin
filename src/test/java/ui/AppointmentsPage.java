package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AppointmentsPage extends Page {

    public AppointmentsPage(WebDriver driver) {
        super(driver);
        driver.get(getPath()+"?command=Overview");
    }

    public boolean containsAppointmentWithId(String id) {
        List<WebElement> trs = driver.findElements(By.cssSelector("td"));
        for (WebElement tr: trs) {
            if (tr.getText().equals(id)){
                return true;
            }
        }
        return false;
    }

    public boolean containsErrorMessage(String id) {
        WebElement error = driver.findElement(By.cssSelector("em"));
        return error.getText().equals(id);
    }
}