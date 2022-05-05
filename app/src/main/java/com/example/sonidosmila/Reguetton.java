package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Reguetton extends AppCompatActivity {

    ImageButton btnRe1, btnRe2, btnRe3, btnRe4, btnRe5;
    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5, btnP;
    String url1 = "https://www.musica.com/letras.asp?letra=2531268";
    String url2 = "https://genius.com/Aventura-and-bad-bunny-volvi-lyrics";
    String url3 = "https://www.musica.com/letras.asp?letra=2392517";
    String url4 = "https://www.letras.com/cnco/reggaeton-lento-bailemos/";
    String url5 = "https://www.letras.com/daddy-yankee/limbo/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguetton);

        btnRe1 = findViewById(R.id.reg1);
        btnRe2 = (ImageButton) findViewById(R.id.reg2);
        btnRe3 = (ImageButton) findViewById(R.id.reg3);
        btnRe4 = (ImageButton) findViewById(R.id.reg4);
        btnRe5 = (ImageButton) findViewById(R.id.reg5);
        btnlink1 = findViewById(R.id.btnre1);
        btnlink2 = findViewById(R.id.btnre2);
        btnlink3 = findViewById(R.id.btnre3);
        btnlink4 = findViewById(R.id.btnre4);
        btnlink5 = findViewById(R.id.btnre5);

        btnRe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Reguetton.this, R.raw.reguebichota);
                mp.start();
            }
        });

        btnRe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Reguetton.this, R.raw.reguelocuraautomatica);
                mp.start();
            }
        });

        btnRe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Reguetton.this, R.raw.reguellamadoemergencia);
                mp.start();
            }
        });

        btnRe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Reguetton.this, R.raw.reguepobrediabla);
                mp.start();
            }
        });

        btnRe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Reguetton.this, R.raw.reguesaliosol);
                mp.start();
            }
        });

        btnlink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url1);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
//                Log.d("click","ok");
            }
        });

        btnlink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url2);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

        btnlink3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url3);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

        btnlink4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url4);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

        btnlink5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url5);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

    }
}