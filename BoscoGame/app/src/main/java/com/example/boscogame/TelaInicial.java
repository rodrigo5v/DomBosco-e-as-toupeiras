package com.example.boscogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity{

    //Avatares
    Button Biniciar, Binst, Bcred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        //Associacoes
        Biniciar =(Button)findViewById(R.id.BIniciar);
        Binst=(Button)findViewById(R.id.BInst);
        Bcred=(Button)findViewById(R.id.BCred);

        //Escutar
        Biniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BiniciarActivity();
            }
        });
        Binst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BinstActivity();
            }
        });
        Bcred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BcredActivity();
            }
        });
    }
    private void BiniciarActivity() {
        startActivity(new Intent(TelaInicial.this, TelaJogo.class));
    }

    private void BcredActivity() {
        startActivity(new Intent(TelaInicial.this, TelaCreditos.class));
    }

    private void BinstActivity() {
        startActivity(new Intent(TelaInicial.this, instruction.class));
    }
}

