package com.scaler.oops.designpatterns.factory;

import com.scaler.oops.designpatterns.factory.Menu.Menu;
import com.scaler.oops.designpatterns.factory.buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.IOS);

        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();

        button.clickButton();
        menu.showMenu();
    }
}
