package com.scaler.oops.generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Pair p = new Pair();
//        p.first = "Scaler";
//        p.second = 3.14;
//
//        //With Object data type, we don't get any compile time safety.
//        Double first = (Double) p.first;
//
//        System.out.println(first);

        Pair<Double, Double> p1 = new Pair<>();
        p1.first = 1.0; // Compile Time Safety.
        p1.second = 2.0;

        // Double d = p1.first;

        Pair<String, Double> p2 = new Pair<>();
        p2.first = "Saurabh";
        p2.second = 89.0;

        Pair<Integer, Double> p3 = new Pair<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add("Scaler"); // compile Time Safety.

        Map<Integer, String> map1 = new HashMap<>();

        // Generics came in Java-5
        // Java is a backward compatible language.
//        Map map2 = new HashMap();
//        map2.put(89.0, "Manvendra");


        doSomething(list);

        List<Double> doubles = new ArrayList<>();
        doSomething(doubles);

        List<String> strings = new ArrayList<>();
//        doSomething(strings);

        List list1 = new ArrayList(); // List with Raw Type.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("DEBUG");
    }

    public static void doSomething(List<? extends Number> numbers) {
        System.out.println(numbers);
    }

    // public static void doSomething2(List<? super Dog> list) {}

    //super
}
