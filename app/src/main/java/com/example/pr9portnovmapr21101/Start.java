package com.example.pr9portnovmapr21101;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity implements View.OnClickListener {

    ImageView d;
    ImageButton s;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        s = findViewById(R.id.but_arrow);
        s.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Steps.class);
        startActivity(intent);
    }
}