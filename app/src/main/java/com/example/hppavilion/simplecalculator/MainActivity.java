package com.example.hppavilion.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    EditText editText;
    EditText editText2;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = editText.getText().toString();
                String number2 = editText2.getText().toString();
                int a = Integer.parseInt(number1);
                int b = Integer.parseInt(number2);
                int sum = a + b;

                Log.d("hello", number1 + "+" + number2 + "=" + sum);
                textView.setText(number1 + "+" + number2 + "=" + sum);


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = editText.getText().toString();
                String number2 = editText2.getText().toString();
                int a = Integer.parseInt(number1);
                int b = Integer.parseInt(number2);
                int minus = a - b;

                Log.d("hello", number1 + "-" + number2 + "=" + minus);
                textView.setText(number1 + "-" + number2 + "=" + minus);


            }

        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = editText.getText().toString();
                String number2 = editText2.getText().toString();
                int a = Integer.parseInt(number1);
                int b = Integer.parseInt(number2);
                int multipication = a * b;

                Log.d("hello", number1 + "*" + number2 + "=" + multipication);
                textView.setText(number1 + "*" + number2 + "=" + multipication);

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = editText.getText().toString();
                String number2 = editText2.getText().toString();
                int a = Integer.parseInt(number1);
                int b = Integer.parseInt(number2);
                int divider = a / b;

                Log.d("hello", number1 + "*" + number2 + "=" + divider);
                textView.setText(number1 + "/" + number2 + "=" + divider);

            }
        });
    }
}

