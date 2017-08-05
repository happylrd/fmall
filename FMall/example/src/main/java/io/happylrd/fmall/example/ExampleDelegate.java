package io.happylrd.fmall.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import io.happylrd.juno.core.delegate.JunoDelegate;

public class ExampleDelegate extends JunoDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
