package com.scaler.oops.designpatterns.factory;

public class Flutter {
    public void refreshUI() {
        System.out.println("Refreshing UI");
    }

    //Some more non factory methods.

    //Let's move all the factory methods in separate interface UIFactory.

//    Button createButton() {
//        if (platform is Android) {
//            return new AndroidButton();
//        } else if (platform is Windows) {
//            return new WindowsButton();
//        } else if () {
//
//        }
//    }
//
//    Menu createMenu() {
//
//    }


    //Create a factory method to get the corresponding UIFactory object.
    public UIFactory createUIFactory(SupportedPlatforms platform) {
        return UIFactoryHelper.getUIFactory(platform);
    }
}
