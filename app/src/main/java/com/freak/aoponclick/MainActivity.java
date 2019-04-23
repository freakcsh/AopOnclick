package com.freak.aoponclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.freak.aop.AopOnclick;


public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
    private Button aop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aop = findViewById(R.id.aop);
        aop.setOnClickListener(new View.OnClickListener() {
            @AopOnclick
            @Override
            public void onClick(View v) {
                Log.e(TAG, "点击了");
            }
        });
    }

}
