package com.scaler.oops.synchronization.addersubtractorsyncmethod;

public class Subtractor implements Runnable {
    private Count count;

    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            count.addValue(-i);
        }
    }
}
