package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.plusButton);
        Button minus = findViewById(R.id.minusButton);
        Button multiply = findViewById(R.id.multiplyButton);
        Button divide = findViewById(R.id.divideButton);

        final EditText firstNumber = findViewById(R.id.firstNumber);
        final EditText secondNumber = findViewById(R.id.secondNumber);

        final TextView resultTextView = findViewById(R.id.resultTextView);

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(secondNumber.getText().toString()) != 0) {
                    int result = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());
                    resultTextView.setText(result);
                } else {
                    resultTextView.setText(R.string.error);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString());
                resultTextView.setText(result);
            }
        });

        multiply.setOnClickListener(v -> resultTextView.setText(Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString())));

        plus.setOnClickListener(v -> resultTextView.setText(Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString())));

    }
}
