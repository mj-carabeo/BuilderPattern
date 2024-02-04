# BuilderPattern

### Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

Here is the link to my UML diagram: https://lucid.app/lucidchart/b60cea17-dbcb-4fbf-933c-069e071ccfb2/edit?beaconFlowId=ECE9CD7DFC54057E&invitationId=inv_91faf3f6-d211-4bfe-9ac5-b25fb53bb4bd&page=0_0#
