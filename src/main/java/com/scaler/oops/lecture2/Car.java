package com.scaler.oops.lecture2;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public List<Seat> seats;

    Car() {

    }

    Car(Car car) {
//        this.seats = car.seats;

        this.seats = new ArrayList<>();

        int numberOfSeats = car.seats.size();

        for (int i = 0; i < numberOfSeats; i++) {
            this.seats.add(new Seat());
        }
    }
}
