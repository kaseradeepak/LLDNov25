package com.scaler.oops.concurrency1;

public class Main {
    public static void main(String[] args) {
        //Thread.currentThread().getName() -> gives the name of the current thread.
        //Java by default creates a main thread to run our application.
        System.out.println("Hello World, This is printed by " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();

        Thread t2 = new Thread(helloWorldPrinter);
        t2.start();

        Thread t3 = new Thread(helloWorldPrinter);
        t3.start();

        Thread t4 = new Thread(helloWorldPrinter);
        t4.start();

        System.out.println("Hello World, This is printed by " + Thread.currentThread().getName());
    }
}


/*

Question : Create a new thread and print Hello World from that.

Steps:
1. Create a task that you want to execute in a separate thread.
    - Create a Task class.
    - Make this class implements Runnable interface.
    - Implement run() method.
        - Inside run method write the code to perform the task that we want to execute in a new thread.
2. Create a thread.
3. Assign the task to the thread.
4. Start the thread.

 */
