package uni.pu.fmi.userReservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.Database;
import uni.pu.fmi.controllers.ReservationController;
import uni.pu.fmi.controllers.ScreeningController;
import uni.pu.fmi.controllers.SeatController;
import uni.pu.fmi.controllers.UserController;
import uni.pu.fmi.models.Reservation;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;

import java.util.List;

public class UserReservationTest {
    private Database database;
    private ScreeningController screeningController;
    private ReservationController reservationController;
    private UserController userController;
    private SeatController seatController;
    private String movie;
    private Screening screening;
    private Seat seat;
    private User user;
    private Reservation reservation;

    @Given("a new instance of the Database")
    public void createDatabase() {
        database = new Database();
    }

    @Given("instances of the controllers are created")
    public void createControllers() {
        screeningController = new ScreeningController(database);
        reservationController = new ReservationController(database);
        userController = new UserController(database);
        seatController = new SeatController(database);
    }

    @Given("sample data for testing is created")
    public void createSampleData() {
        movie = "Movie 1";
        screening = new Screening(movie, "10:00 AM");
        seat = new Seat(1);
        user = new User("John Doe");
    }

    @When("screening, seat, and user are added to the database")
    public void addScreeningSeatUser() {
        screeningController.addScreening(screening);
        seatController.addSeat(seat);
        userController.addUser(user);
    }

    @When("a reservation is made for the user")
    public void makeReservation() {
        reservation = new Reservation(screening, seat, user);
        reservationController.addReservation(reservation);
    }

    @Then("the reservation should be added successfully")
    public void verifyReservationAdded() {
        List<Reservation> reservations = reservationController.getAllReservations();
        Assert.assertTrue(reservations.contains(reservation));
    }

    @Then("the seat should be marked as reserved")
    public void verifySeatReserved() {
        Seat reservedSeat = seatController.getSeat(seat.getSeatNumber());
        Assert.assertTrue(reservedSeat.isReserved());
    }

    @Then("the reservation can be retrieved and printed")
    public void retrieveAndPrintReservation() {
        List<Reservation> reservations = reservationController.getAllReservations();
        Assert.assertTrue(reservations.contains(reservation));

        System.out.println(
                reservation.getScreening().getMovie() +
                        " - " +
                        reservation.getSeat().getSeatNumber() +
                        " - " +
                        reservation.getUser().getName()
        );
    }
}

