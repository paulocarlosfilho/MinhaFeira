package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NovaListaCriarNovaLista extends AppCompatActivity {

    private TextView buttonVoltarNovaListaCriarNova;
    private TextView buttonSalvarNovaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_lista_criar_nova_lista);

        iniciarComponents();

        buttonVoltarNovaListaCriarNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaListaCriarNovaLista.this, CriarNovaLista.class);
                startActivity(intent);
            }
        });

        buttonSalvarNovaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaListaCriarNovaLista.this, Perfil_usuario.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponents(){
        buttonVoltarNovaListaCriarNova = findViewById(R.id.buttonVoltarNovaListaCriarNova);
        buttonSalvarNovaLista = findViewById(R.id.buttonSalvarNovaLista);
    }
}