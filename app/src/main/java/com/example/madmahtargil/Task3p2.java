
package com.example.madmahtargil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Task3p2 extends AppCompatActivity {

    int points = 0;
    private TextView texthere;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3p2);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        points = bundle.getInt("Points");

        texthere = findViewById(R.id.textView5);
        image = findViewById(R.id.emoji);

        if (points == 3) {
            texthere.setText("100!!!!");
        }
        else if (points == 2) {
            texthere.setText("66%.. good enough");
            image.setImageResource(R.drawable.ok);
        }
        else if (points == 1) {
            texthere.setText("bro.. 33%?");
            image.setImageResource(R.drawable.sad);
        }
        else{
            texthere.setText("go touch grass with your 0% brain capability");
        }
    }
}