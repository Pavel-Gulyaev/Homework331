package com.example.homework3_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumerCreator numerCreator = new NumerCreator(
                (TextView) findViewById(R.id.text),
                (Button) findViewById(R.id.btn0),
                (Button) findViewById(R.id.btn1),
                (Button) findViewById(R.id.btn2),
                (Button) findViewById(R.id.btn3),
                (Button) findViewById(R.id.btn4),
                (Button) findViewById(R.id.btn5),
                (Button) findViewById(R.id.btn6),
                (Button) findViewById(R.id.btn7),
                (Button) findViewById(R.id.btn8),
                (Button) findViewById(R.id.btn9),
                (Button) findViewById(R.id.btndot),
                (Button) findViewById(R.id.btnsign),
                (Button) findViewById(R.id.btnC));

        Calculate calculate = new Calculate(
                numerCreator,
                (Button) findViewById(R.id.btnMinus),
                (Button) findViewById(R.id.btnMulty),
                (Button) findViewById(R.id.btnpercent),
                (Button) findViewById(R.id.btnPlus),
                (Button) findViewById(R.id.btnDel),
                (Button) findViewById(R.id.btnEqual));



    }
}
