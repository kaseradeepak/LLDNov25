package com.scaler.oops.designpatterns.factory;

import com.scaler.oops.designpatterns.factory.Menu.Menu;
import com.scaler.oops.designpatterns.factory.Menu.WindowsMenu;
import com.scaler.oops.designpatterns.factory.buttons.Button;
import com.scaler.oops.designpatterns.factory.buttons.WindowsButton;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
