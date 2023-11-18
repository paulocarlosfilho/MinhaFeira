package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Perfil_usuario extends AppCompatActivity {

    private TextView botao_minhas_listas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        iniciarComponentes();

        botao_minhas_listas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, MinhasListas.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        botao_minhas_listas = findViewById(R.id.button1MinhasListas);
    }
}