Feature: Overview Timeslots

  As a teacher
  I want to view a list of available timeslots
  So that I can choose a timeslot for my appointment

  # Personas
  # Frederik – teacher

  Rule: The timeslots must be available

    Scenario:  The registration period is closed
      Given	There are timeslots to choose from
      When “Frederik” wants a list of all available timeslots
      Then “Frederik” gets notified that the registration period is closed

    Scenario:  There are no timeslots available
      Given	There are timeslots to choose from
      When “Frederik” wants a list of all available timeslots
      Then “Frederik” gets notified that there are no timeslots available

    Scenario:  There are timeslots available
      Given	There are timeslots to choose from
      When “Frederik” wants a list of all available timeslots
      Then “Frederik” gets a list of all available timeslots

    Scenario:  The maximum amount of appointments in the event have already been reached
      Given	There are timeslots to choose from
      When “Frederik” wants a list of all available timeslots
      Then “Frederik” gets notified that he already reached his maximum amount of appointments in this event