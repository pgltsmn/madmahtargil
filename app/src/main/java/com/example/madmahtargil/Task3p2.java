
package com.example.madmahtargil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Task3p2 extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3p2);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        points = bundle.getInt("Points");
    }
}