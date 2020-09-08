package com.example.toupeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class jogo extends AppCompatActivity implements View.OnClickListener {

    Chronometer cronometro;
    TextView Pontos;
    Button Bpause;
    ImageView ImgSB1,ImgSB2,ImgSB3,ImgSB4,ImgSB5,ImgSB6,ImgSB7,ImgSB8,ImgSB9,ImgSB10,ImgSB11,ImgSB12;
    ImageView ImgSV1, ImgSV2, ImgSV3;
    ImageView[] buracos;

    boolean correndo = false;
    int delay = 5000;   // delay de 5 seg.
    int interval = 1000;  // intervalo de 1 seg.
    int pontos, vidas = 0;

    long pausado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        //Associações
        cronometro = (Chronometer)findViewById(R.id.cronometro);
        //TextView para pontuação
        Pontos = (TextView)findViewById(R.id.pontos);
        //Button
        Bpause = (Button)findViewById(R.id.Pause);

        //Buracos
        ImgSB1 = (ImageView)findViewById(R.id.ImgSB1);
        ImgSB2 = (ImageView)findViewById(R.id.ImgSB2);
        ImgSB3 = (ImageView)findViewById(R.id.ImgSB3);
        ImgSB4 = (ImageView)findViewById(R.id.ImgSB4);
        ImgSB5 = (ImageView)findViewById(R.id.ImgSB5);
        ImgSB6 = (ImageView)findViewById(R.id.ImgSB6);
        ImgSB7 = (ImageView)findViewById(R.id.ImgSB7);
        ImgSB8 = (ImageView)findViewById(R.id.ImgSB8);
        ImgSB9 = (ImageView)findViewById(R.id.ImgSB9);
        ImgSB10 = (ImageView)findViewById(R.id.ImgSB10);
        ImgSB11 = (ImageView)findViewById(R.id.ImgSB11);
        ImgSB12 = (ImageView)findViewById(R.id.ImgSB12);

        //Vidas
        ImgSV1 = (ImageView)findViewById(R.id.ImgSV1);
        ImgSV2 = (ImageView)findViewById(R.id.ImgSV2);
        ImgSV3 = (ImageView)findViewById(R.id.ImgSV3);

        //Escutar click
        Bpause.setOnClickListener(this);

       /*buracos[0]=ImgSB1;
        buracos[1]=ImgSB2;
        buracos[2]=ImgSB3;
        buracos[3]=ImgSB4;
        buracos[4]=ImgSB5;
        buracos[5]=ImgSB6;
        buracos[6]=ImgSB7;
        buracos[7]=ImgSB8;
        buracos[8]=ImgSB9;
        buracos[9]=ImgSB10;
        buracos[10]=ImgSB11;
        buracos[11]=ImgSB12;*/

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Toupeira();
            }
        }, delay, interval);

        startCronometro();
    }

    @Override
    public void onClick(View view) {
        //Indo para outra tela
        Intent tela = new Intent(this, pause.class);
        pauseCronometro();
        startActivity(tela);
    }

    public void ChangeImg1(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB1.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg2(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB2.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg3(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB3.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg4(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB4.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg5(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB5.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg6(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB6.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg7(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB7.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg8(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB8.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg9(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB9.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg10(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB1.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg11(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB10.setImageResource(R.drawable.buraco);
    }

    public void ChangeImg12(View view) {
        pontos+=30;
        Pontos.setText(String.valueOf(pontos));
        ImgSB11.setImageResource(R.drawable.buraco);
    }

    public void startCronometro(){
        if (!correndo){
            cronometro.setBase(SystemClock.elapsedRealtime() - pausado);
            cronometro.start();
            correndo = false;
        }
    }

    public void pauseCronometro(){
        if (correndo){
            cronometro.stop();
            pausado = SystemClock.elapsedRealtime() - cronometro.getBase();
            correndo = false;
        }
    }

    public void resetCronometro(){
        cronometro.setBase(SystemClock.elapsedRealtime());
        pausado = 0;
    }

    public void Toupeira(){
        Random r = new Random();
        int pos = r.nextInt(11 - 0) + 0;

        if (pos == 0){
            ImgSB1.setImageResource(R.drawable.toupeira);
        }else if(pos == 1){
            ImgSB2.setImageResource(R.drawable.toupeira);
        }else if(pos == 2){
            ImgSB3.setImageResource(R.drawable.toupeira);
        }else if(pos == 3){
            ImgSB4.setImageResource(R.drawable.toupeira);
        }else if(pos == 4){
            ImgSB5.setImageResource(R.drawable.toupeira);
        }else if(pos == 5){
            ImgSB6.setImageResource(R.drawable.toupeira);
        }else if(pos == 6){
            ImgSB7.setImageResource(R.drawable.toupeira);
        }else if(pos == 7){
            ImgSB8.setImageResource(R.drawable.toupeira);
        }else if(pos == 8){
            ImgSB9.setImageResource(R.drawable.toupeira);
        }else if(pos == 9){
            ImgSB10.setImageResource(R.drawable.toupeira);
        }else if(pos == 10){
            ImgSB11.setImageResource(R.drawable.toupeira);
        }else if(pos == 11){
            ImgSB12.setImageResource(R.drawable.toupeira);
        }
    }
}