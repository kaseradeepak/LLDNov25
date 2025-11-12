package com.scaler.oops.lecture2;

import com.scaler.oops.lecture1.Student;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        //Student st = new Student();

        //System.out.println(st.name);

        Seat s1 = new Seat();
        Seat s2 = new Seat();
        Seat s3 = new Seat();

        List<Seat> seats = new ArrayList<>();
        seats.add(s1);
        seats.add(s2);
        seats.add(s3);

        Car c1 = new Car();
        c1.seats = seats;

        Car c1Copy = new Car(c1);

        System.out.println("DEBUG");
    }
}
