package com.scaler.oops.lecture4;

public class ArrayBasedStack implements Stack {
    @Override
    public void push(int x) {
        System.out.println("ArrayBasedStack push method.");
    }

    @Override
    public void pop() {
        System.out.println("ArrayBasedStack pop method.");
    }
}
