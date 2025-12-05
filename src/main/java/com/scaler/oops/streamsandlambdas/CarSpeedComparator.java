package com.scaler.oops.streamsandlambdas;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if (c1.speed < c2.speed) {
            //c1 should come before c2.
            return -1;
        } else if (c1.speed > c2.speed) {
            //c1 should come after c2.
            return 1;
        }

        return 0;
    }
}
