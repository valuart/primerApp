package com.example.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mi_vista);
        inicializarVista();
        Log.d("salida", "Pasando por onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("salida", "Pasando por onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("salida", "Pasando por onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("salida", "Pasando por onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("salida", "Pasando por onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("salida", "Pasando por onDestroy");
    }

    private void inicializarVista(){
        enviar=findViewById(R.id.BTEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SegundaActivity.class);
                i.putExtra("mensaje","Esta es una prueba");
                i.putExtra("valor",33);
                startActivity(i);

            }
        });

    }

}