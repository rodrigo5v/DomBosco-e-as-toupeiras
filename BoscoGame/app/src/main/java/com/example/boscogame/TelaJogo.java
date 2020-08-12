package com.example.boscogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaJogo extends AppCompatActivity implements View.OnClickListener {

    //Avatares
    Button Bpause;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        //Associacoes
        Bpause=(Button)findViewById(R.id.Bpause);

        //Escutar click
        Bpause.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Indo para outra tela
        Intent tela = new Intent(TelaJogo.this, TelaPause.class);

        startActivity(tela);
    }
}
