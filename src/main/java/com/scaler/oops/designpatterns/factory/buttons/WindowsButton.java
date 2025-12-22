package com.scaler.oops.designpatterns.factory.buttons;

public class WindowsButton implements Button {

    @Override
    public void clickButton() {
        System.out.println("Windows Button clicked.");
    }
}
