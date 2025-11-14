package com.scaler.oops.lecture3;

public class main {
    public static void main(String[] args) {

        //Constructor Chaining.
        D d = new D();

        Mentor mentor = new Mentor("Saurabh", "saurabh@google.com");

//        Mentor m = new User(); - Object of parent class can't be stored in the child class reference.

        User user = new Mentor();

        user.fun(); // Run Time Polymorphism.

        //Child class attrs can't be accessed via Parent class reference.
        // user.company = "Google";

        // ((Mentor) user).company = "Google";

        System.out.println("DEBUG");
    }
}
