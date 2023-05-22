package uni.pu.fmi.Reservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;
import static org.junit.Assert.assertEquals;
public class ReservationSteps {

    ReservationScreenModel model = new ReservationScreenModel();

    @Given("The reservation screen is open")
    public void openReservationScreen() {
    }

    @When("Movie name is entered as {string}")
    public void enterMovieName(String movie) {
        model.setMovie(movie);
    }

    @When("Screening start time is entered as {string}")
    public void enterScreeningStartTime(String startTime) {
        model.setStartTime(startTime);
    }

    @When("Seat number is entered as {int}")
    public void enterSeatNumber(int seatNumber) {
        model.setSeatNumber(seatNumber);
    }

    @When("User name is entered as {string}")
    public void enterUserName(String username) {
        model.setUsername(username);
    }

    @When("Reserve button is clicked")
    public void clickReserveButton() {
        model.clickReserveButton();
    }

    @Then("The message {string} appears")
    public void verifyMessage(String expectedMessage) {
        assertEquals(expectedMessage, model.getMessage());
    }
}
