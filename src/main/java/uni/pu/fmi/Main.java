package uni.pu.fmi;

import uni.pu.fmi.controllers.*;
import uni.pu.fmi.models.Reservation;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        // Create instances of the controllers
        ScreeningController screeningController = new ScreeningController(database);
        ReservationController reservationController = new ReservationController(database);
        UserController userController = new UserController(database);
        SeatController seatController = new SeatController(database);

        // Create sample data for testing
        String movie = "Movie 1";
        Screening screening = new Screening(movie, "10:00 AM");
        Seat seat = new Seat(1);
        User user = new User("John Doe");

        // Add screening, seat, and user to the database
        screeningController.addScreening(screening);
        seatController.addSeat(seat);
        userController.addUser(user);

        // Make a reservation for the user
        Reservation reservation = new Reservation(screening, seat, user);
        reservationController.addReservation(reservation);

        // Verify the reservation
        List<Reservation> reservations = reservationController.getAllReservations();
        if (reservations.contains(reservation)) {
            System.out.println("Reservation successfully made for " + user.getName());
        } else {
            System.out.println("Failed to make reservation for " + user.getName());
        }
    }
}