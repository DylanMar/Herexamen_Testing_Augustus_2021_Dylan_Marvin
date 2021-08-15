Feature: Add Appointments

  As a teacher
  I want to be able to make appointments
  So that I can make appointments that students can enlist for

  # Personas
  # Frederik – teacher

  Rule: The appointment must have an available location

    Scenario:  The location is not available
      Given There are locations to choose from
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that he should pick a location that is available

    Scenario: The location is available
      Given There are locations to choose from
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that the appointment has been made

    Scenario: The location is not specified
      Given There are locations to choose from
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that he should specify a location

  Rule: The appointment must have a maximum amount of enlistings

    Scenario: The maximum amount of enlistings is not specified
      Given There must be a maximum amount of enlistings
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that he should specify a maximum amount of enlistings

    Scenario: The maximum amount of enlistings is a positive number
      Given There must be a maximum amount of enlistings
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that the appointment has been made

    Scenario: The maximum amount of enlistings is a negative number
      Given There must be a maximum amount of enlistings
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that he should specify a positive number as the maximum amount of enlistings

  Rule: The appointment must have an available timeslot

    Scenario: The timeslot is not available
      Given There must be an available timeslot
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that he should specify an available timeslot

    Scenario: The timeslot is available
      Given There must be an available timeslot
      When “Frederik” wants to make an appointment
      Then “Frederik” gets notified that the appointment has been made

    Scenario: The timeslot is not specified
    Given There must be an available timeslot
    When “Frederik” wants to make an appointment
    Then “Frederik” gets notified that he should specify an available timeslot