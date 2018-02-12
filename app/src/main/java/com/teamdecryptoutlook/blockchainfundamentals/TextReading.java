package com.teamdecryptoutlook.blockchainfundamentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TextReading extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_reading);

        TextView tv = (TextView) findViewById(R.id.printScreen);
        tv.setMovementMethod(new ScrollingMovementMethod());

        Bundle bundle = getIntent().getExtras();
        String ch = bundle.getString("cases");
    }

    switch(ch){
        case a : 


    }

    }


