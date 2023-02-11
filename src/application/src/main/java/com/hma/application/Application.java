package com.hma.application;

import com.hma.application.apps.App;
import com.hma.application.apps.WaterControlApp;

public class Application {

    public static void main(String[] args) {
        final App app = new WaterControlApp();
        app.start();
    }

}
