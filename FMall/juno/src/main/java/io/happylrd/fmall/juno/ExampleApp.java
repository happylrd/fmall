package io.happylrd.fmall.juno;

import android.app.Application;

import io.happylrd.juno.core.app.Juno;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Juno.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
