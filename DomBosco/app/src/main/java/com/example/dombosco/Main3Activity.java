package com.example.dombosco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    Button BVoltaTC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BVoltaTC=(Button)findViewById(R.id.BVoltaTC);

        BVoltaTC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent voltinha = new Intent(this, MainActivity.class);
        startActivity(voltinha);
    }
}
