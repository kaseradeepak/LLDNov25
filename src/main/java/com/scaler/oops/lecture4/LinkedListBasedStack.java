package com.scaler.oops.lecture4;

public class LinkedListBasedStack implements Stack {
    @Override
    public void push(int x) {
        System.out.println("LinkedListBasedStack push method.");
    }

    @Override
    public void pop() {
        System.out.println("LinkedListBasedStack pop method.");
    }
}
