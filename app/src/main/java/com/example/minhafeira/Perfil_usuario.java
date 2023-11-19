package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Perfil_usuario extends AppCompatActivity {


    private TextView buttonMinhasListas;
    private TextView botao_analise_gastos;
    private TextView buttonCriarNovaLista;

    private TextView textViewDicas;
    private TextView textViewSuperMercadoProximo;
    private TextView textViewPromocoesSemana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        iniciarComponentes();

        buttonMinhasListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, MinhasListas.class);
                startActivity(intent);
            }
        });

        buttonCriarNovaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, CriarNovaLista.class);
                startActivity(intent);
            }
        });


        botao_analise_gastos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, AnaliseDeGastos.class);
                startActivity(intent);
            }
        });

        textViewDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, Dicas.class);
                startActivity(intent);
            }
        });

        textViewSuperMercadoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, SuperMercadoProximo.class);
                startActivity(intent);
            }
        });

        textViewPromocoesSemana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil_usuario.this, PromocoesSemana.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        buttonMinhasListas = findViewById(R.id.buttonMinhasListas);
        buttonCriarNovaLista = findViewById(R.id.buttonCriarNovaLista);
        botao_analise_gastos = findViewById(R.id.buttonAnaliseGastos);

        textViewDicas = findViewById(R.id.textViewDicas);
        textViewSuperMercadoProximo = findViewById(R.id.textViewSuperMercadoProximo);
        textViewPromocoesSemana = findViewById(R.id.textViewPromocoesSemana);
    }
}