package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAndina extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer sound;
    Button alondraSound, colibriSound, grullaSound, pavaSound, perdizSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andina);

        alondraSound = (Button) findViewById(R.id.alondraSound);
        alondraSound.setOnClickListener(this);

        colibriSound = (Button) findViewById(R.id.colibriSound);
        colibriSound.setOnClickListener(this);

        grullaSound = (Button) findViewById(R.id.grullaSound);
        grullaSound.setOnClickListener(this);

        pavaSound = (Button) findViewById(R.id.pavaSound);
        pavaSound.setOnClickListener(this);

        perdizSound = (Button) findViewById(R.id.perdizSound);
        perdizSound.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(sound != null){
            sound.release();
        }
        int id = v.getId();
        switch (id){
            case R.id.alondraSound:
                sound = MediaPlayer.create(this,R.raw.alondra);
                break;
            case R.id.colibriSound:
                sound = MediaPlayer.create(this,R.raw.colibri);
                break;
            case R.id.grullaSound:
                sound = MediaPlayer.create(this,R.raw.grulla);
                break;
            case R.id.pavaSound:
                sound = MediaPlayer.create(this,R.raw.pava);
                break;
            case R.id.perdizSound:
                sound = MediaPlayer.create(this,R.raw.perdices);
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