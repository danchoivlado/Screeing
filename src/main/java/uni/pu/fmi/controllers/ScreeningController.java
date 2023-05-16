package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;
import uni.pu.fmi.models.Screening;

import java.util.List;

public class ScreeningController {
    private Database database;

    public ScreeningController(Database database) {
        this.database = database;
    }

    public void addScreening(Screening screening) {
        database.addScreening(screening);
    }

    public void removeScreening(Screening screening) {
        database.removeScreening(screening);
    }

    public List<Screening> getAllScreenings() {
        return database.getAllScreenings();
    }
}
