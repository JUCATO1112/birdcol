package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCaribe extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    Button gallinaSound, gavilanSound, garzaSound, pelicanoSound, playeroSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caribe);

        gallinaSound = (Button) findViewById(R.id.gallinaSound);
        gallinaSound.setOnClickListener(this);

        gavilanSound = (Button) findViewById(R.id.gavilanSound);
        gavilanSound.setOnClickListener(this);

        garzaSound = (Button) findViewById(R.id.garzaSound);
        garzaSound.setOnClickListener(this);

        pelicanoSound = (Button) findViewById(R.id.pelicanoSound);
        pelicanoSound.setOnClickListener(this);

        playeroSound = (Button) findViewById(R.id.playeroSound);
        playeroSound.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(sound != null){
            sound.release();
        }
        int id = v.getId();
        switch (id){
            case R.id.gallinaSound:
                sound = MediaPlayer.create(this,R.raw.gallineta_morada);
                break;
            case R.id.garzaSound:
                sound = MediaPlayer.create(this,R.raw.garza_tricolor);
                break;
            case R.id.gavilanSound:
                sound = MediaPlayer.create(this,R.raw.gavilan_pico_gancho);
                break;
            case R.id.pelicanoSound:
                sound = MediaPlayer.create(this,R.raw.pelicano_cafe);
                break;
            case R.id.playeroSound:
                sound = MediaPlayer.create(this,R.raw.playero_blanco);
                break;
        }
        sound.seekTo(0);
        sound.start();
    }

    public void onPause(){
        super.onPause();

        if(sound != null){
            sound.release();
        }
    }
}