package io.happylrd.fmall.juno;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import io.happylrd.juno.core.app.Juno;
import io.happylrd.juno.ec.icon.FontEcModule;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Juno.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
