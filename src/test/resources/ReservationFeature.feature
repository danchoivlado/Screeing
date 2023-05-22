Feature: User Reservation

  Scenario Outline: User reservation
    Given The user opens the reservation screen
    When The user enters their username: "<username>"
    And The user selects a movie: "<movie>"
    And The user selects a start time: "<startTime>"
    And The user selects a seat number: <seatNumber>
    And The user clicks the reserve button
    Then The user sees the message: "<expectedMessage>"

    Examples:
      | username | movie | startTime | seatNumber | expectedMessage       |
      | john     | film1 | 19:00     | 1          | Reservation successful|
      |          | film1 | 19:00     | 1          | User does not exist   |
      | john     |       | 19:00     | 1          | Screening does not exist |
      | john     | film1 |           | 1          | Screening does not exist |
      | john     | film1 | 19:00     |            | Seat does not exist   |
      | john     | film1 | 19:00     | 2          | Seat is already reserved |
