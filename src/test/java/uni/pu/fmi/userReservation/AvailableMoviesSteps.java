package uni.pu.fmi.userReservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.Database;
import uni.pu.fmi.controllers.MovieController;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AvailableMoviesSteps {
    private Database database;
    private MovieController movieController;
    private List<String> availableMovies;

    @Given("a new instance of the Database")
    public void createDatabase() {
        database = new Database();
    }

    @Given("instances of the controllers are created")
    public void createControllers() {
        movieController = new MovieController(database);
    }

    @Given("sample movies are added to the database")
    public void addSampleMovies() {
        movieController.addMovie("Movie 1");
        movieController.addMovie("Movie 2");
        movieController.addMovie("Movie 3");
    }

    @When("the user checks the available movies")
    public void checkAvailableMovies() {
        availableMovies = movieController.getAllMovies();
    }

    @Then("the user should see all the available movies")
    public void verifyAvailableMovies() {
        List<String> expectedMovies = new ArrayList<>();
        expectedMovies.add("Movie 1");
        expectedMovies.add("Movie 2");
        expectedMovies.add("Movie 3");

        Assert.assertEquals(expectedMovies, availableMovies);
    }
}

