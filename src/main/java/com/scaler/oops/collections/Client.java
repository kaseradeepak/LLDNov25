package com.scaler.oops.collections;

import javax.swing.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<Integer> vector = new Vector<>();

        List<Integer> linkedList = new LinkedList<>();

        Set<String> set = new TreeSet<>();
        set.add("India");
        set.add("Singapore");
        set.add("China");
        set.add("Australia");
        set.add("New Zealand");
        set.add("Sri Lanka");

        System.out.println(set);
    }
}
