package com.scaler.oops.streamsandlambdas;

import com.scaler.oops.lecture1.Student;

import java.sql.Array;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorldPrinter);
        //t1.start();

        //Anonymous class.
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, Thread name: " + Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread(task);
        //t2.start();

        //Lambda -> Works with Functional Interfaces.
        // () -> {}
        Thread t3 = new Thread( () -> System.out.println("Hello World, Thread name: " + Thread.currentThread().getName()));
        //t3.start();

        //Anonymous Class.
//        SampleInterface sampleInterface = new SampleInterface() {
//            @Override
//            public void display() {
//
//            }
//
//            @Override
//            public void show() {
//
//            }
//
//            @Override
//            public void doSomething() {
//
//            }
//        };

        List<Integer> numbers = Arrays.asList(7, 2, 10, 4, 9, 8, 1, 6, 5, 3);

        // System.out.println(numbers);

        Collections.sort(numbers); // sort function will sort the data in natural sorting order by default.

        // System.out.println(numbers);

        Car c1 = new Car("X", 420, 4, 100000);
        Car c2 = new Car("E", 170, 6, 120000);
        Car c3 = new Car("A", 200, 7, 80000);
        Car c4 = new Car("H", 800, 2, 1000000);
        Car c5 = new Car("O", 600, 8, 70000);

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        CarSeatsComparator carSeatsComparator = new CarSeatsComparator();

        //Anonymous Class.
        Comparator<Car> speedComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        };

        // Collections.sort(cars, speedComparator); // Comparable provides default sorting order.

        //Comparator using Lambda.
        // () -> {}
        Collections.sort(cars, (Car car1, Car car2) -> car1.noOfSeats - car2.noOfSeats);

        // Collections.sort(students, (Student s1, Student s2) -> s1.marks - s2.marks);

        for (Car car : cars) {
            System.out.println("[Name: " + car.name + ", Speed: " + car.speed + ", Seats: " + car.noOfSeats + ", Price: " + car.price + "]");
        }

//        for (int i = 0; i <= 100; i++)
//            System.out.println("Hello");
    }
}
