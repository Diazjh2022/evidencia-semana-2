package com.example.ejerciciogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSaludar;
    Button btnDespedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludar = findViewById(R.id.btnSaludar);
        btnDespedir =findViewById(R.id.btnDespedir);
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hola mundo", Toast.LENGTH_SHORT).show();
            }
        });
        btnDespedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chao nomas", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
