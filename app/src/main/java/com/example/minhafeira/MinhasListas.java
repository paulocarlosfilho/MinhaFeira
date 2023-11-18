package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MinhasListas extends AppCompatActivity {

    private TextView botao_analise_gastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_listas);

        iniciarComponetes();

        botao_analise_gastos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhasListas.this, AnaliseDeGastos.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponetes(){
        botao_analise_gastos = findViewById(R.id.buttonAnaliseGastos);
    }
}