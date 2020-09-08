package com.example.dombosco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Avatares
    Button Biniciar, Binst, Bcred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        startActivity(new Intent(this, Jogo.class));
    }

    private void BcredActivity() {
        startActivity(new Intent(this, Main3Activity.class));
    }

    private void BinstActivity() {
        startActivity(new Intent(this, Main5Activity.class));

    }
}
