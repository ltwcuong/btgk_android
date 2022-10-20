package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListView3 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview3);
        TextView textView = findViewById(R.id.vh1);
        TextView textview7 = findViewById(R.id.vh8);
        TextView textview8 = findViewById(R.id.vh9);
        TextView textview10 = findViewById(R.id.vh11);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ListView3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
