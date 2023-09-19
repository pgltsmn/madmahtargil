package com.example.madmahtargil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task1 extends AppCompatActivity {

    private Button sum;
    private EditText num1;
    private EditText num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.sum);
        num1 = findViewById(R.id.num1enter);
        num2 = findViewById(R.id.num2enter);
        result = findViewById(R.id.result1);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt (num1.getText().toString());
                int n2 = Integer.parseInt (num2.getText().toString());
                int res = n1+n2;
                String str1 = String.valueOf(res);
                result.setText(str1);
            }
        });

    }


}