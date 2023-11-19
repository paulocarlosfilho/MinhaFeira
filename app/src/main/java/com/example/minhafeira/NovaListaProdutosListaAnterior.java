package com.example.minhafeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NovaListaProdutosListaAnterior extends AppCompatActivity {

    private TextView buttonVoltarNovaListaProdutosListaAnterior;
    private TextView buttonSalvarNovaListaProdutosListaAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_lista_produtos_lista_anterior);

        iniciarComponentes();

        buttonVoltarNovaListaProdutosListaAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaListaProdutosListaAnterior.this, CriarNovaLista.class);
                startActivity(intent);
            }
        });

        buttonSalvarNovaListaProdutosListaAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaListaProdutosListaAnterior.this, Perfil_usuario.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        buttonVoltarNovaListaProdutosListaAnterior = findViewById(R.id.buttonVoltarNovaListaProdutosListaAnterior);
        buttonSalvarNovaListaProdutosListaAnterior = findViewById(R.id.buttonSalvarNovaListaProdutosListaAnterior);
    }
}