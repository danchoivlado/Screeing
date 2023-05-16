package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;
import uni.pu.fmi.models.Seat;

import java.util.List;

public class SeatController {
    private Database database;

    public SeatController(Database database) {
        this.database = database;
    }

    public void addSeat(Seat seat) {
        database.addSeat(seat);
    }
    public Seat getSeat(Integer seatNumber) {
        List<Seat> seats = database.getAllSeats();
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                return seat;
            }
        }
        return null; // Seat not found
    }


    public void removeSeat(Seat seat) {
        database.removeSeat(seat);
    }

    public List<Seat> getAllSeats() {
        return database.getAllSeats();
    }
}

