package com.scaler.oops.synchronization.addersubstractorsynchornized;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            synchronized (Count.class) { // similar to lock.lock()
                count.value += i;
            } // similar to lock.unlock()
        }
    }
}
