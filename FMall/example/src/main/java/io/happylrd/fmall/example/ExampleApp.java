package io.happylrd.fmall.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import io.happylrd.juno.core.app.Juno;
import io.happylrd.juno.core.net.interceptor.DebugInterceptor;
import io.happylrd.juno.ec.icon.FontEcModule;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Juno.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();
    }
}
