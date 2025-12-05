package com.scaler.oops.streamsandlambdas;

import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 7, 4, 3, 5, 6, 2, 7, 1, 8);

        Stream<Integer> s1 = numbers.stream();
        // Stream<String> s2 = null;

        // s2.filter( (s1) -> {})

        // System.out.println(s1);

        // Stream<Integer> s2 = s1.limit(5); // limit is an intermediate function.
        // s2.count(); // count is a terminal function, which closes the stream.

        // s2.forEach(System.out::println);

        //Task: Filter out even numbers from the list.

//        Stream<Integer> s2 = s1.filter( (x) -> { return x%2 == 0;});
//        s2.forEach(System.out::println);


//        List<Integer> output = s1
//                .filter( (x) -> x%2 == 0)
//                .sorted()
//                .map( (x) -> x*x)
//                .collect(Collectors.toList());

        Stream<Integer> s3 = s1
                .filter( (x) -> x%2 == 0)
                .map( (x) -> x*x)
                .sorted();

        //s3.forEach(System.out::println);


//        System.out.println(output);
        // System.out.println(s2);

        List<String> words = List.of("java", "scaler", "lambda", "stream", "streams", "programming", "data structures");

        //Using streams, count the number of words with more than 6 characters.
        System.out.println(words.stream().filter( (word) -> word.length() > 6).count());

        List<Double> prices = List.of(100.0, 200.5, 1000.0, 500.67);

        //Using streams, add 10% tax to each price.
        List<Double> outputPrices = prices.stream().map( (x) -> x * 1.10).collect(Collectors.toList());

//        System.out.println(outputPrices);

        List<Integer> numbers2 = List.of(5, 20, 10, 50, 80, 7, 13);

        //Using streams, calculate the sum of all the numbers greater than 10;
        int sum = numbers2.stream().filter(x -> x > 10).mapToInt(x -> x).sum();

        System.out.println(sum);
    }
}
