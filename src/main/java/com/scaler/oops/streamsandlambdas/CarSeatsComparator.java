package com.scaler.oops.streamsandlambdas;

import java.util.Comparator;

public class CarSeatsComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.noOfSeats - c2.noOfSeats;
    }
}
