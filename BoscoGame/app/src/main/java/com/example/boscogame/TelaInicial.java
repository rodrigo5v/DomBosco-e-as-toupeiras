package com.example.boscogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity{

    //Avatares
    Button BIniciar, BInst, BCred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        //Associacoes
        BIniciar=(Button)findViewById(R.id.BIniciar);
        BInst=(Button)findViewById(R.id.BInst);
        BCred=(Button)findViewById(R.id.BCred);

        //Escutar
        BIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BIniciarActivity();
            }
        });
        BInst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BInstActivity();
            }
        });
        BCred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BCredActivity();
            }
        });
    }

    private void BCredActivity() {
        startActivity(new Intent(TelaInicial.this, TelaCreditos.class));
    }

    private void BInstActivity() {
        startActivity(new Intent(TelaInicial.this, instruction.class));
    }

    private void BIniciarActivity() {
        startActivity(new Intent(TelaInicial.this, TelaJogo.class));
    }
}

