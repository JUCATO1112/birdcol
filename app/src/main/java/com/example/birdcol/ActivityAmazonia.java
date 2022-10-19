package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAmazonia extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    Button harpiaSound, esmeraldaSound, colibriSound, lechuzonSound, trepadorSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazonia);

        harpiaSound = (Button) findViewById(R.id.harpiaSound);
        harpiaSound.setOnClickListener(this);

        esmeraldaSound = (Button) findViewById(R.id.esmeraldaSound);
        esmeraldaSound.setOnClickListener(this);

        colibriSound = (Button) findViewById(R.id.topacioSound);
        colibriSound.setOnClickListener(this);

        lechuzonSound = (Button) findViewById(R.id.lechuzonSound);
        lechuzonSound.setOnClickListener(this);

        trepadorSound = (Button) findViewById(R.id.trepadorSound);
        trepadorSound.setOnClickListener(this);


        }

        @Override
        public void onClick(View v){
            if(sound != null){
                sound.release();
            }
            int id = v.getId();
            switch (id){
                case R.id.harpiaSound:
                    sound = MediaPlayer.create(this,R.raw.aguila_arpia);
                    break;
                case R.id.esmeraldaSound:
                    sound = MediaPlayer.create(this,R.raw.chiribiquete_esmeralda);
                    break;
                case R.id.topacioSound:
                    sound = MediaPlayer.create(this,R.raw.colibri_topacio);
                    break;
                case R.id.lechuzonSound:
                    sound = MediaPlayer.create(this,R.raw.lechuzon_anteojos);
                    break;
                case R.id.trepadorSound:
                    sound = MediaPlayer.create(this,R.raw.trepador_colorado);
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