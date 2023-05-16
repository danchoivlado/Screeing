package uni.pu.fmi.controllers;

import uni.pu.fmi.Database;
import uni.pu.fmi.models.User;

import java.util.List;

public class UserController {
    private Database database;

    public UserController(Database database) {
        this.database = database;
    }

    public void addUser(User user) {
        database.addUser(user);
    }

    public void removeUser(User user) {
        database.removeUser(user);
    }

    public List<User> getAllUsers() {
        return database.getAllUsers();
    }
}

