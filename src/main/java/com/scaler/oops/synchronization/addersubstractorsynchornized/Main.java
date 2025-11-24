package com.scaler.oops.synchronization.addersubstractorsynchornized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join(); //waits for the thread to get complete it's execution.
        t2.join();

        System.out.println("Count : " + count.value);
    }
}
