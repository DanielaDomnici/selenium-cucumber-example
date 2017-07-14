Feature: Facebook login

  Scenario:Correct login with valid credentials (username and password)
    Given Navigate to "http://www.facebook.com"
    And Enter the username as testandroid683@gmail.com and the password as qaqaqaqa12
    And Click the login button
    Then Verify that the user is logged
