package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pop extends AppCompatActivity {

    ImageButton btnP1, btnP2, btnP3, btnP4, btnP5;
    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5;
    String url = "https://www.letras.com/shawn-mendes/treat-you-better/";
    String url2 = "https://www.letras.com/the-weeknd/save-your-tears/";
    String url3 = "https://www.letras.com/taylor-swift/shake-it-off/";
    String url4 = "https://www.letras.com/sam-smith/like-i-can/traduccion.html";
    String url5 = "https://www.letras.com/julia-michaels/what-a-time-feat-niall-horan/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        btnP1 = findViewById(R.id.pop1);
        btnP2 = (ImageButton) findViewById(R.id.pop2);
        btnP3 = (ImageButton) findViewById(R.id.pop3);
        btnP4 = (ImageButton) findViewById(R.id.pop4);
        btnP5 = (ImageButton) findViewById(R.id.pop5);
        btnlink1 = findViewById(R.id.btnp1);
        btnlink2 = findViewById(R.id.btnp2);
        btnlink3 = findViewById(R.id.btnp3);
        btnlink4 = findViewById(R.id.btnp4);
        btnlink5 = findViewById(R.id.btnp5);
        MediaPlayer mp = MediaPlayer.create(Pop.this, R.raw.poptreatyoubetter);
        MediaPlayer mp1 = MediaPlayer.create(Pop.this, R.raw.popeverytear);
        MediaPlayer mp2 = MediaPlayer.create(Pop.this, R.raw.popshakeitoff);
        MediaPlayer mp3 = MediaPlayer.create(Pop.this, R.raw.popwhatatime);
        MediaPlayer mp4 = MediaPlayer.create(Pop.this, R.raw.popican);

        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp.isPlaying()){
                    mp.pause();

                } else {
                    mp.start();
                }
            }
        });

        btnP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying()){
                    mp1.pause();

                } else {
                    mp1.start();
                }
            }
        });

        btnP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();

                } else {
                    mp2.start();
                }
            }
        });

        btnP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();

                } else {
                    mp3.start();
                }
            }
        });

        btnP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();

                } else {
                    mp4.start();
                }
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
}