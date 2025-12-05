package com.scaler.oops.streamsandlambdas;

public class Car implements Comparable<Car> {
    String name;
    int speed;
    int noOfSeats;
    int price;

    Car(String name, int speed, int noOfSeats, int price) {
        this.name = name;
        this.speed = speed;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
//        if (this.speed < car.speed) {
//            return -5; // this object will come before car object.
//        } else if (this.speed > car.speed) {
//            return 89; // car object before this object.
//        }
//
//        return 0;

        return this.price - car.price;
    }
}
