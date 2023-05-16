package uni.pu.fmi.models;

public class Reservation {
    private Screening screening;
    private Seat seat;
    private User user;

    public Reservation(Screening screening, Seat seat, User user) {
        this.screening = screening;
        this.seat = seat;
        this.user = user;
    }

    public Screening getScreening() {
        return screening;
    }

    public Seat getSeat() {
        return seat;
    }

    public User getUser() {
        return user;
    }
}
