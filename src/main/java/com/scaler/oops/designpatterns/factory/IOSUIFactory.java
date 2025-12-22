package com.scaler.oops.designpatterns.factory;

import com.scaler.oops.designpatterns.factory.Menu.IOSMenu;
import com.scaler.oops.designpatterns.factory.Menu.Menu;
import com.scaler.oops.designpatterns.factory.buttons.Button;
import com.scaler.oops.designpatterns.factory.buttons.IOSButton;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
