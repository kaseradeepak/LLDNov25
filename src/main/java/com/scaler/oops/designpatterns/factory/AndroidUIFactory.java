package com.scaler.oops.designpatterns.factory;

import com.scaler.oops.designpatterns.factory.Menu.AndroidMenu;
import com.scaler.oops.designpatterns.factory.Menu.Menu;
import com.scaler.oops.designpatterns.factory.buttons.AndroidButton;
import com.scaler.oops.designpatterns.factory.buttons.Button;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
