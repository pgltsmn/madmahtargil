package com.example.madmahtargil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Task3 extends AppCompatActivity {

    private RadioGroup group1;
    private RadioGroup group2;
    private RadioGroup group3;
    private Button check;
    int p1 = 0;
    int p2 = 0;
    int p3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        check = findViewById(R.id.check);

        group1 = findViewById(R.id.radioGroup3);
        group2 = findViewById(R.id.radioGroup2);
        group3 = findViewById(R.id.radioGroup);

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) p1 = 1;
            }
        });
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton4) p2 = 1;
            }
        });
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton6) p3 = 1;
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Task3p2.class);
                intent.putExtra("Points", p1+p2+p3);
                startActivity(intent);
            }
        });
    }


}