package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.net.URI;

public class botones extends AppCompatActivity {

    ImageButton btnH1, btnH2, btnH3, btnH4, btnH5;
    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5, btnplay1;
    String url = "https://www.waqrapukaraperutours.com/valicha-el-huayno-del-cusco#:~:text=Valicha%20es%20un%20huayno%20popular,es%20la%20abreviatura%20del%20nombre";
    String url2 = "http://blog.pucp.edu.pe/blog/identidadperuana/2018/06/16/adios-pueblo-de-ayacucho-una-gran-cancion-tradicional-por-dos-rostros-del-peru/";
    String url3 = "https://vocesdeayacucho.com/trio-ayacucho-huerfano-pajarillo/#:~:text=Cuando%20se%20habla%20de%20figuras,desconocido%2C%20un%20mensaje%20del%20alma.";
    String url4 = "https://rpp.pe/musica/conciertos/silverio-urbina-triunfa-con-huaino-que-linda-flor-noticia-212796";
    String url5 = "https://sentimientoandinolatam.blogspot.com/2014/02/ojos-azules.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnH1 = findViewById(R.id.huayno1);
        btnH2 = (ImageButton) findViewById(R.id.huayno2);
        btnH3 = (ImageButton) findViewById(R.id.huayno3);
        btnH4 = (ImageButton) findViewById(R.id.huayno4);
        btnH5 = (ImageButton) findViewById(R.id.huayno5);
        btnlink1 = findViewById(R.id.btnh1);
        btnlink2 = findViewById(R.id.btnh2);
        btnlink3 = findViewById(R.id.btnh3);
        btnlink4 = findViewById(R.id.btnh4);
        btnlink5 = findViewById(R.id.btnh5);
        btnplay1 = findViewById(R.id.btnplay);

        btnH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.huaynovalicha);
                mp.start();
            }
        });

        btnH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.huaynopuebloayacucho);
                mp.start();
            }
        });

        btnH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.huaynohuerfanopajarillo);
                mp.start();
            }
        });

        btnH4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.huaynohermosaflor);
                mp.start();
            }
        });

        btnH5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.huaynoojosazules);
                mp.start();
            }
        });
        btnlink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url);
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

//    public void Mensaje (View view){
//        Toast.makeText(this, "Esto es un gato", Toast.LENGTH_LONG).show();
//    }
//
//    public void MensajePerro (View view){
//        Toast.makeText(this, "Esto es un perro", Toast.LENGTH_LONG).show();
//    }
}