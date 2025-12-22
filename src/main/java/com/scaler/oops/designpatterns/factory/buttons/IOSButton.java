package com.scaler.oops.designpatterns.factory.buttons;

public class IOSButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("IOS Button clicked.");
    }
}
