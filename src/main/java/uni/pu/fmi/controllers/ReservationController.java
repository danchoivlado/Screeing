package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;
import uni.pu.fmi.models.Reservation;

import java.util.List;

public class ReservationController {
    private Database database;

    public ReservationController(Database database) {
        this.database = database;
    }

    public void addReservation(Reservation reservation) {
        database.addReservation(reservation);
    }

    public void removeReservation(Reservation reservation) {
        database.removeReservation(reservation);
    }

    public List<Reservation> getAllReservations() {
        return database.getAllReservations();
    }
}

