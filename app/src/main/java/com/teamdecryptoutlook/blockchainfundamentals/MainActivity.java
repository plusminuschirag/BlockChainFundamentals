package com.teamdecryptoutlook.blockchainfundamentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);

    }

    public void nextButtonSet(View view) {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);

    }

    public void first(View v){
        Intent intent = new Intent(MainActivity.this, TextReading.class);
        s="a";
        intent.putExtra( "cases", s );
        startActivity(intent);
    }


}





