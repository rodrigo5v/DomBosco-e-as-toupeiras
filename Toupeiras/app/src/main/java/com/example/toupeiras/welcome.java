package com.example.toupeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class welcome extends AppCompatActivity implements View.OnClickListener {

    EditText Nick;
    Button Salvar;
    private Object digitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Nick = (EditText) findViewById(R.id.nickname);
        Salvar = (Button)findViewById(R.id.salvar);

        Salvar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String digitado;
        digitado = Nick.getText().toString();

        if (digitado == ""){
            Toast.makeText(getBaseContext(), "Insira algo válido", Toast.LENGTH_SHORT).show();
        }
        else{
            SharedPreferences prefs = getSharedPreferences("jogador", Context.MODE_PRIVATE);
            SharedPreferences.Editor alt = prefs.edit();

            alt.putString("nick", Nick.getText().toString());

            alt.apply();
            Toast.makeText(getBaseContext(),"Gravado com sucesso", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, home.class));
        }
    }
}