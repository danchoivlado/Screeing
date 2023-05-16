Feature: User Reservation

  Scenario Outline: Making a reservation
    Given a new instance of the Database
    And instances of the controllers are created
    And sample data for testing is created
    When screening, seat, and user are added to the database
    And a reservation is made for the user
    Then the reservation should be added successfully
    And the seat should be marked as reserved
    And the reservation can be retrieved and printed

    Examples:
      | Movie   | StartTime | SeatNumber | UserName    |
      | Movie 1 | 10:00 AM  | 1          | John Doe    |
      | Movie 2 | 12:30 PM  | 3          | Jane Smith  |
      | Movie 3 | 3:00 PM   | 5          | Bob Johnson |
      | Movie 4 | 6:15 PM   | 2          | Alice Brown |
