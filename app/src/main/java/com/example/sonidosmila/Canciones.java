package com.example.sonidosmila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Canciones extends AppCompatActivity {

    ListView LISTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canciones);
        LISTA = (ListView)findViewById(R.id.ltvLista);
    }

    public void huayno(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Canciones.this,R.array.huayno, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

    public void salsa(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Canciones.this,R.array.salsa, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

    public void reggueton(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Canciones.this,R.array.reguetton, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

    public void rock(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Canciones.this,R.array.rock, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

    public void pop(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Canciones.this,R.array.pop, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }
}