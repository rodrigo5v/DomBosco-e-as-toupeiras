package com.example.toupeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cred extends AppCompatActivity implements View.OnClickListener {

    Button Voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cred);

        Voltar=(Button)findViewById(R.id.Voltar);

        Voltar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent voltinha = new Intent(cred.this, home.class);
        startActivity(voltinha);
    }
}