package com.scaler.oops.synchronization.addersubstractormutex;

import javax.sound.sampled.FloatControl;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t2.start();
        t1.start();

        t1.join(); //waits for the thread to get complete it's execution.
        t2.join();

        System.out.println("Count : " + count.value);
    }
}
