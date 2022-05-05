package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Rock extends AppCompatActivity {

    ImageButton btnR1, btnR2, btnR3, btnR4, btnR5;
    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5, btnP;
    String url1 = "https://www.letras.com/soda-stereo/37249/";
    String url2 = "https://www.letras.com/keane/107919/";
    String url3 = "https://www.letras.com/sixpence-none-the-richer/886439/";
    String url4 = "https://www.letras.com/andres-calamaro/1678/";
    String url5 = "https://www.musica.com/letras.asp?letra=854610";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        btnR1 = findViewById(R.id.rock1);
        btnR2 = (ImageButton) findViewById(R.id.rock2);
        btnR3 = (ImageButton) findViewById(R.id.rock3);
        btnR4 = (ImageButton) findViewById(R.id.rock4);
        btnR5 = (ImageButton) findViewById(R.id.rock5);
        btnlink1 = findViewById(R.id.btnr1);
        btnlink2 = findViewById(R.id.btnr2);
        btnlink3 = findViewById(R.id.btnr3);
        btnlink4 = findViewById(R.id.btnr4);
        btnlink5 = findViewById(R.id.btnr5);
        btnP = findViewById(R.id.btnPause);

        btnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rockpersiana);
                mp.start();
            }
        });

        btnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rockflaca);
                mp.start();
            }
        });

        btnR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rockkissme);
                mp.start();
            }
        });

        btnR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rockeverubodyschanging);
                mp.start();
            }
        });

        btnR5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rocknobemverrain);
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

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Rock.this, R.raw.rockpersiana);
                mp.pause();
            }
        });
    }
}