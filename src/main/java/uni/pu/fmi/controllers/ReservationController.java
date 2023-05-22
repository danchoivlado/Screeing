package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;
import uni.pu.fmi.models.Reservation;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;

import java.util.List;

public class ReservationController {
    private Database database;

    public ReservationController(Database database) {
        this.database = database;
    }

    public String reserveSeat(String movie, String startTime, int seatNumber, String username) {
        Screening screening = database.getAllScreenings().stream()
                .filter(s -> s.getMovie().equals(movie) && s.getStartTime().equals(startTime))
                .findFirst()
                .orElse(null);
        if (screening == null) {
            return "Screening not found";
        }

        Seat seat = screening.getSeats().stream()
                .filter(s -> s.getSeatNumber() == seatNumber)
                .findFirst()
                .orElse(null);
        if (seat == null) {
            return "Seat not found";
        }

        User user = database.getAllUsers().stream()
                .filter(u -> u.getName().equals(username))
                .findFirst()
                .orElse(null);
        if (user == null) {
            return "User not found";
        }

        Reservation reservation = new Reservation(screening, seat, user);
        database.addReservation(reservation);

        return "Seat reserved successfully";
    }
}
