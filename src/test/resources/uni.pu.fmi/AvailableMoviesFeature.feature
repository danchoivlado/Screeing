Feature: Available Movies

  Scenario Outline: User checks available movies
    Given a new instance of the Database
    And instances of the controllers are created
    And sample movies are added to the database
    When the user checks the available movies
    Then the user should see all the available movies

    Examples:
      | Movie 1 |
      | Movie 2 |
      | Movie 3 |
      | Movie 4 |
      | Movie 5 |
