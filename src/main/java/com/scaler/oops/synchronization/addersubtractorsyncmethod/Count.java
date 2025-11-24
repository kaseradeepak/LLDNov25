package com.scaler.oops.synchronization.addersubtractorsyncmethod;

public class Count {
    private int value = 0;

    public synchronized void addValue(int i) {
        this.value += i;
    }

    public int getValue() {
        return value;
    }
}
