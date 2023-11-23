package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Receitas extends AppCompatActivity {

    private TextView buttonVoltarReceitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        iniciarComponentes();

        buttonVoltarReceitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Receitas.this, Dicas.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        buttonVoltarReceitas = findViewById(R.id.buttonVoltarReceitas);
    }
}