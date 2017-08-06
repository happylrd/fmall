package io.happylrd.fmall.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import io.happylrd.juno.core.delegate.JunoDelegate;
import io.happylrd.juno.core.net.RestClient;
import io.happylrd.juno.core.net.callback.IError;
import io.happylrd.juno.core.net.callback.IFailure;
import io.happylrd.juno.core.net.callback.ISuccess;

public class ExampleDelegate extends JunoDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    private void testRestClient() {
        RestClient.builder()
                .url("")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build();
    }
}
