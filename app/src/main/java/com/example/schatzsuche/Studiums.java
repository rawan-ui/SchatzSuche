package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Studiums extends AppCompatActivity {
    Button informatik;
    PseudoDatabase pb;
    List<String>lvs;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studium_course);
        Intent i = getIntent();
        informatik = findViewById(R.id.bt1);
        informatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Studiums.this, StudiumDetails.class);
                startActivity(intent);

            }
        });
    }
}