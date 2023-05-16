package uni.pu.fmi;
import uni.pu.fmi.models.Reservation;
import uni.pu.fmi.models.Screening;
import uni.pu.fmi.models.Seat;
import uni.pu.fmi.models.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Screening> screenings;
    private List<Reservation> reservations;
    private List<String> movies;
    private List<User> users;
    private List<Seat> seats;

    public Database() {
        screenings = new ArrayList<>();
        reservations = new ArrayList<>();
        movies = new ArrayList<>();
        users = new ArrayList<>();
        seats = new ArrayList<>();
    }

    // Screenings
    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void removeScreening(Screening screening) {
        screenings.remove(screening);
    }

    public List<Screening> getAllScreenings() {
        return screenings;
    }

    // Reservations
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    // Movies
    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public List<String> getAllMovies() {
        return movies;
    }

    // Users
    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    // Seats
    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }

    public List<Seat> getAllSeats() {
        return seats;
    }
}

