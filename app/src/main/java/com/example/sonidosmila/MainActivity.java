package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audio, salsa, pop, rock, reg, canciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = findViewById(R.id.idHuayno);
        salsa = findViewById(R.id.idSalsa);
        pop = findViewById(R.id.idPop);
        rock = findViewById(R.id.idRock);
        reg = findViewById(R.id.idReg);
        canciones = findViewById(R.id.idcanciones);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioH();
            }
        });

        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioS();
            }
        });

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioP();
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioR();
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioReg();
            }
        });

        canciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioC();
            }
        });
    }

    private void LlamarAudioH()
    {
        Intent intent = new Intent(MainActivity.this,botones.class);
        startActivity(intent);
    }
    private void LlamarAudioS()
    {
        Intent intent = new Intent(MainActivity.this,Salsa.class);
        startActivity(intent);
    }
    private void LlamarAudioP()
    {
        Intent intent = new Intent(MainActivity.this,Pop.class);
        startActivity(intent);
    }
    private void LlamarAudioR()
    {
        Intent intent = new Intent(MainActivity.this,Rock.class);
        startActivity(intent);
    }
    private void LlamarAudioReg()
    {
        Intent intent = new Intent(MainActivity.this,Reguetton.class);
        startActivity(intent);
    }
    private void LlamarAudioC()
    {
        Intent intent = new Intent(MainActivity.this,Canciones.class);
        startActivity(intent);
    }
}