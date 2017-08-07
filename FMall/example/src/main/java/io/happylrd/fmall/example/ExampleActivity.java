package io.happylrd.fmall.example;

import io.happylrd.juno.core.activity.ProxyActivity;
import io.happylrd.juno.core.delegate.JunoDelegate;
import io.happylrd.juno.ec.launcher.LauncherDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public JunoDelegate setRootDelegate() {
        return new LauncherDelegate();
    }
}
