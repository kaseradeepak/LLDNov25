package com.scaler.oops.designpatterns.factory.buttons;

public class AndroidButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Android Button clicked.");
    }
}
