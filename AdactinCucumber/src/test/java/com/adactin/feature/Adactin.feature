Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Adactin Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page

Scenario: User Search Hotel In The Adactin Application
When user Select The Location
And user Select The Hotels
And user Select The Roomtype
And user Select The NumberofRooms
And user Select The Checkindate
And user Select The Checkoutdate
And user Select The Adultsperroom
And user Select The Childrenperrooms
Then user Click The Search Button

Scenario: User Select The Hotel In The Adactin Application
When user Select The Hotel
Then user Click The Continue Button

Scenario: User Book The Hotel In The Adactin Application
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Billingaddress In Address Field
And user Enter The Creditcardnumber In Cardnumber Field
And user Enter The Creditcardtype In Cardtype Field
And user Enter The Expirydate In Expirydate Field
And user Enter The Cvvnumber In Cvvfield
Then user Click The Booknow Button

Scenario: User Logout The Adactin Application
Then Click The Logout Button



