package com.example.toupeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pause extends AppCompatActivity {

    Button BExit, BPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause);

        BExit=(Button)findViewById(R.id.BExit);
        BPlay=(Button)findViewById(R.id.BPlay);

        BExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BExitActivity();
            }
        });

        BPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BPlayActivity();
            }
        });
    }
    private void BPlayActivity() {
        startActivity(new Intent(this,jogo.class));
    }

    private void BExitActivity() {

        startActivity(new Intent(this,home.class));
    }
}