package com.scaler.oops.designpatterns.factory;

import com.scaler.oops.designpatterns.factory.Menu.Menu;
import com.scaler.oops.designpatterns.factory.buttons.Button;

public interface UIFactory {
    Button createButton();

    Menu createMenu();

//    DropDown createDropDown();
}
