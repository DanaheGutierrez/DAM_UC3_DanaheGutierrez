package com.example.dam_uc3_danahegutierrez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = findViewById(R.id.button_registrate);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }
}