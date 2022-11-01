package com.example.month2_lesson7_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView show = findViewById(R.id.resultTwo);
        String result = getIntent().getStringExtra("Result");
        show.setText(result);
        Button destroy = findViewById(R.id.destroy);
        destroy.setOnClickListener(view -> {
         onDestroy();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}