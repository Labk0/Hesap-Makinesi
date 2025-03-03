package com.example.hesapmakinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        double lastNumber = 0;

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button0 = (Button) findViewById(R.id.button0);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonFactorial = (Button) findViewById(R.id.buttonFactorial);
        Button buttonRoot = (Button) findViewById(R.id.buttonRoot);
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        Button buttonUs = (Button) findViewById(R.id.buttonUs);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonComma = (Button) findViewById(R.id.buttonComma);

        EditText editTextIslem = (EditText) findViewById(R.id.editTextIslem);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "0";
                editTextIslem.setText(currentIslem);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "1";
                editTextIslem.setText(currentIslem);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "2";
                editTextIslem.setText(currentIslem);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "3";
                editTextIslem.setText(currentIslem);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "4";
                editTextIslem.setText(currentIslem);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "5";
                editTextIslem.setText(currentIslem);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "6";
                editTextIslem.setText(currentIslem);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "7";
                editTextIslem.setText(currentIslem);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "8";
                editTextIslem.setText(currentIslem);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentIslem = editTextIslem.getText().toString();
                currentIslem += "9";
                editTextIslem.setText(currentIslem);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lastNumber = Double.parseDouble(editTextIslem.getText().toString());

            }
        });
    }
}