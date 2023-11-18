package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnaliseDeGastos extends AppCompatActivity {

    private TextView botao_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analise_de_gastos);

        iniciarComponentes();

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnaliseDeGastos.this, Perfil_usuario.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        botao_voltar = findViewById(R.id.buttonVoltaAnaliseGastos);
    }
}