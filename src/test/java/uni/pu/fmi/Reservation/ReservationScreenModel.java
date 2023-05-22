package uni.pu.fmi.Reservation;

import uni.pu.fmi.Database;
import uni.pu.fmi.controllers.ReservationController;
import uni.pu.fmi.models.Reservation;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;

public class ReservationScreenModel {
    private String movie;
    private String startTime;
    private int seatNumber;
    private String username;
    private String message;
    private ReservationController controller;

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void clickReserveButton() {
        message = controller.reserveSeat(movie, startTime, seatNumber, username);
    }
}


