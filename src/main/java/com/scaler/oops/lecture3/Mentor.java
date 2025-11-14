package com.scaler.oops.lecture3;

public class Mentor extends User {
    String company;
    double avgRating;

    Mentor(String name, String email) {
        super(); // should be the first line of child constructor.
        System.out.println("Mentor Constructor");
    }

    Mentor() {

    }

//    int fun() {
//        System.out.println("Mentor class fun method.");
//        return 0;
//    }

    void fun() {
        System.out.println("Mentor class fun method.");
    }
}
