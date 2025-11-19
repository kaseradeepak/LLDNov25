package com.scaler.oops.concurrency1;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World, This is printed by " + Thread.currentThread().getName());
    }
}
