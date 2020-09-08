package com.example.toupeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView Ola;
    Button Biniciar, Binst, Bcred;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Ola =(TextView)findViewById(R.id.Ola);
        Biniciar =(Button)findViewById(R.id.BIniciar);
        Binst=(Button)findViewById(R.id.BInst);
        Bcred=(Button)findViewById(R.id.BCred);
        getNick();
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
    public void getNick(){
        SharedPreferences prefs = getSharedPreferences("jogador", Context.MODE_PRIVATE);
        Ola.setText("Bem vindo de volta, "+prefs.getString("nick", "não tem"));
    }
    private void BiniciarActivity() {
        startActivity(new Intent(home.this, jogo.class));
    }

    private void BcredActivity() {
        startActivity(new Intent(home.this, cred.class));
    }

    private void BinstActivity() {
        startActivity(new Intent(home.this, instruction.class));
    }
}