package com.example.mochginanjarbusiri.notifactionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Moch Ginanjar Busiri on 9/13/2016.
 */
public class ChartActivity extends AppCompatActivity{

    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        textView = (TextView)findViewById(R.id.textView);
    }
}
