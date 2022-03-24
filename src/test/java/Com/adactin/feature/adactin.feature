Feature: Hotel Booking In Adactin Application

Scenario: Login Paage Functionality
Given User Application Lanuch
When User Enter The  Username In Username Field
And user Enter The Passwword In Password Field
Then User Click The Login Button And NavigateTo The Search Hotel Page

Scenario: Hotel Search Functionality
When User Select The Loction Field
And User Select The Hotels Field
And user Select The Room Type Field
And User Select The Number of Rooms Field
And User Select The Check In Date Field
And User Select The Check Out Date Field
And User Select The Adult Per Room Field
And User Select The Children Per Room Field
Then User Click The Search Button And Navigate To The Select Hotel Page


Scenario: Hotel Select Functionality
When User Select The Hotel Field
Then User Click The Continue Button And Navigate To The Booking Hotel Page

Scenario: Hotel Booking Functionality
When User Enter The Firstname Field
And User Enter The Lastname Field
And User Enter The Billing Address Field
And User Enter The Credit Card Number Field
And User Select The Credit Card Type Field
And User Select The Exprie Date Field
And User Select The Exprie Year Field
And User Enter The CVV Number Field
Then User Click The Book Now Button And Navigate To The  Booking Confirm Page


 