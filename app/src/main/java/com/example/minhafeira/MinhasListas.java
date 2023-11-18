package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MinhasListas extends AppCompatActivity {

    private TextView botao_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_listas);

        iniciarComponetes();

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhasListas.this, Perfil_usuario.class);
                startActivity(intent);
            }
        });
    }


    private void iniciarComponetes(){
        botao_voltar = findViewById(R.id.buttonVoltaMinhasListas);
    }
}