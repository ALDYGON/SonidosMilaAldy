package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Salsa extends AppCompatActivity {

    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5;
    ImageButton btnS1, btnS2, btnS3, btnS4, btnS5;
    String url1 = "https://es.wikipedia.org/wiki/Tito_Nieves";
    String url2 = "http://www.radiolakalle.pe/la-historia-detras-del-tema-lloraras-de-oscar-dleon/#:~:text=El%20tema%20%E2%80%9CLlorar%C3%A1s%E2%80%9D%20de%20Oscar,historia%20de%20la%20salsa%20venezolana.";
    String url3 = "https://www.musica.com/letras.asp?letra=2294006";
    String url4 = "https://www.musica.com/letras.asp?letra=2259998";
    String url5 = "https://www.letras.com/daniela-darcourt/probablemente/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);

        btnS1 = findViewById(R.id.salsa1);
        btnS2 = (ImageButton) findViewById(R.id.salsa2);
        btnS3 = (ImageButton) findViewById(R.id.salsa3);
        btnS4 = (ImageButton) findViewById(R.id.salsa4);
        btnS5 = (ImageButton) findViewById(R.id.salsa5);
        btnlink1 = findViewById(R.id.btns1);
        btnlink2 = findViewById(R.id.btns2);
        btnlink3 = findViewById(R.id.btns3);
        btnlink4 = findViewById(R.id.btns4);
        btnlink5 = findViewById(R.id.btns5);

        btnS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsalloraras);
                mp.start();
            }
        });

        btnS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsafantasias);
                mp.start();
            }
        });

        btnS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsaesehombre);
                mp.start();
            }
        });

        btnS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsatudequevas);
                mp.start();
            }
        });

        btnS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Salsa.this, R.raw.salsaprobablemente);
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