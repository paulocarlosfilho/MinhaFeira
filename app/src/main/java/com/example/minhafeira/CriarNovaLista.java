package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CriarNovaLista extends AppCompatActivity {

    private TextView buttonVoltarNovaLista;
    private  TextView buttonContinuar;

    private TextView buttonContinuar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_nova_lista);

        inicarComponents();

        buttonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CriarNovaLista.this, NovaListaProdutosListaAnterior.class);
                startActivity(intent);
            }
        });

        buttonContinuar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CriarNovaLista.this, NovaListaCriarNovaLista.class);
                startActivity(intent);
            }
        });

        buttonVoltarNovaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CriarNovaLista.this, Perfil_usuario.class);
                startActivity(intent);
            }
        });
    }

    private void inicarComponents(){
        buttonVoltarNovaLista = findViewById(R.id.buttonVoltarNovaLista);
        buttonContinuar = findViewById(R.id.buttonContinuar);
        buttonContinuar2 = findViewById(R.id.buttonContinuar2);
    }
}