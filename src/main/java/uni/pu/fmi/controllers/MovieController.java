package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;

import java.util.List;

public class MovieController {
    private Database database;

    public MovieController(Database database) {
        this.database = database;
    }

    public void addMovie(String movie) {
        database.addMovie(movie);
    }

    public void removeMovie(String movie) {
        database.removeMovie(movie);
    }

    public List<String> getAllMovies() {
        return database.getAllMovies();
    }
}

