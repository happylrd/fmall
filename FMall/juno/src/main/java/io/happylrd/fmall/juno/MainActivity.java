package io.happylrd.fmall.juno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import io.happylrd.juno.core.app.Juno;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(Juno.getApplication(), "传入Context了", Toast.LENGTH_LONG).show();
    }
}
