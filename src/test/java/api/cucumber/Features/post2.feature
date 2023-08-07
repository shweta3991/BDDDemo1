Feature: Post feature of facebook

  Background: This is for common steps
    Given User should be logged in and should be present on his wall

  @SmokeTest
  Scenario: Post a message on user wall
    When I type the message as "My posts" in the text box
    And Click on the Post button
    Then The message should get posted

  Scenario: Post a video on user wall
    When User supply the youtube link as "www.youtube.com" in the text box
    And Click on the Post button
    Then The video should get posted on the user wall
    And the video should have proper thumbnail.