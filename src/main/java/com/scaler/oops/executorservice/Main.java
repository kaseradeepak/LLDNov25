package com.scaler.oops.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i == 10 || i == 50 || i == 99) {
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);

            //Submit the task to executor service.
            executorService.submit(numberPrinter);
        }
    }
}
