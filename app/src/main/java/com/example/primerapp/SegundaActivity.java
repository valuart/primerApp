package com.example.primerapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {
private TextView mensaje;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        inicializarVista();
    }
    private void inicializarVista() {
        mensaje = findViewById(R.id.TVMensaje);
        String men = getIntent().getStringExtra("mensaje");
        int val = getIntent().getIntExtra("valor", -1);
        mensaje.setText(men+" "+val);
    }
}
