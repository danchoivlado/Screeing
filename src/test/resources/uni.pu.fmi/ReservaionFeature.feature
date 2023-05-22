Feature: Reservation

  Scenario Outline: Reserve a seat
    Given The reservation screen is open
    When Movie name is entered as "<movie>"
    And Screening start time is entered as "<startTime>"
    And Seat number is entered as <seatNumber>
    And User name is entered as "<username>"
    And Reserve button is clicked
    Then The message "<expectedMessage>" appears

    Examples:
      | username | movie          | startTime | seatNumber | expectedMessage                |
      |          | Avengers       | 10:00     | 5          | Please enter a username        |
      | user1    | Avengers       | 10:00     | 5          | Please enter a movie           |
      | user1    | Avengers       |           | 5          | Please enter a start time      |
      | user1    | Avengers       | 10:00     |            | Please enter a seat number     |
      | user1    | Avengers       | 10:00     | 5          | Movie does not exist           |
      | user1    | Avengers       | 10:00     | 6          | Seat is already reserved       |
      | user1    | Avengers       | 10:00     | 5          | Reservation successful         |
      | user2    | Avengers       | 10:00     | 5          | Seat is already reserved       |
