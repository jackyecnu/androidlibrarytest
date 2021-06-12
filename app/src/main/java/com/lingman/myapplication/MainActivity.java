package com.lingman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lingman.utils.DemonTestHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tvTest);
        textView.setText(String.valueOf(DemonTestHelper.Plus1(1)));
        textView.setText(DemonHelloHelper.Go());
    }
}