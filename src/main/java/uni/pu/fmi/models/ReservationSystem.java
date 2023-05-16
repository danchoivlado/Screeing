package uni.pu.fmi.models;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Screening> screenings;
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.screenings = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void removeScreening(Screening screening) {
        screenings.remove(screening);
    }

    public void makeReservation(Screening screening, Seat seat, User user) {
        if (!isSeatReserved(seat)) {
            Reservation reservation = new Reservation(screening, seat, user);
            reservations.add(reservation);
            seat.reserve();
        } else {
            System.out.println("Seat already reserved by another user.");
        }
    }

    public void cancelReservation(Reservation reservation) {
        reservations.remove(reservation);
        reservation.getSeat().unreserve();
    }

    private boolean isSeatReserved(Seat seat) {
        for (Reservation reservation : reservations) {
            if (reservation.getSeat() == seat) {
                return true;
            }
        }
        return false;
    }
}
