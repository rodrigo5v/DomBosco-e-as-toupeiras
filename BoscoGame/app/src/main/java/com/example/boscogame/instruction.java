package com.example.boscogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class instruction extends AppCompatActivity implements View.OnClickListener {

    Button BVoltaTC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        BVoltaTC=(Button)findViewById(R.id.BVoltaTC);

        BVoltaTC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent voltar= new Intent(instruction.this, TelaInicial.class);
        startActivity(voltar);
    }
}
