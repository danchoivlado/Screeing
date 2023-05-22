package uni.pu.fmi.models;
import java.util.ArrayList;
import java.util.List;

public class Screening {
    private String movie;
    private String startTime;
    private List<Seat> seats;

    public Screening(String movie, String startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public String getMovie() {
        return this.movie;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }
}
