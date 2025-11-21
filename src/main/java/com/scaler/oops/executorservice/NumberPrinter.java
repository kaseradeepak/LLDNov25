package com.scaler.oops.executorservice;

public class NumberPrinter implements Runnable {
    private int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + "-" + Thread.currentThread().getName());
//        try {
//            Thread.sleep(100000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
