package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dicas extends AppCompatActivity {

    private TextView buttonReceitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas);

        iniciarComponentes();

        buttonReceitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dicas.this, Receitas.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        buttonReceitas = findViewById(R.id.buttonReceitas);
    }
}