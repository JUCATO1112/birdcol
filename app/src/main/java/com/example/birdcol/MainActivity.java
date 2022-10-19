package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navActivity(View view){
        Intent opciones = null;

        switch (view.getId()){
            case R.id.insular_bton:
                opciones = new Intent(MainActivity.this, ActivityInsular.class);
                break;
            case R.id.amazonia_bton:
                opciones = new Intent(MainActivity.this, ActivityAmazonia.class);
                break;
            case R.id.andina_bton:
                opciones = new Intent(MainActivity.this, ActivityAndina.class);
                break;
            case R.id.caribe_bton:
                opciones = new Intent(MainActivity.this, ActivityCaribe.class);
                break;
            case R.id.orinoquia_bton:
                opciones = new Intent(MainActivity.this, ActivityOrinoquia.class);
                break;
            case R.id.pacifica_bton:
                opciones = new Intent(MainActivity.this, ActivityPacifica.class);
                break;
        }
        startActivity(opciones);
    }
}