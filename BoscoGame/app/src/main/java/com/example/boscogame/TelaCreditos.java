package com.example.boscogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCreditos extends AppCompatActivity implements View.OnClickListener {

    Button BVoltaTC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_creditos);

        BVoltaTC=(Button)findViewById(R.id.BVoltaTC);

        BVoltaTC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent voltinha = new Intent(TelaCreditos.this, TelaInicial.class);
        startActivity(voltinha);
    }
}
