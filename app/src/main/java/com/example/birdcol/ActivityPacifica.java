package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPacifica extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    Button cotingaSound, guacamayoSound, tucanSound, gaviotinSound, paujilSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacifica);

        cotingaSound = (Button) findViewById(R.id.cotingaSound);
        cotingaSound.setOnClickListener(this);

        guacamayoSound = (Button) findViewById(R.id.guacamayoSound);
        guacamayoSound.setOnClickListener(this);

        tucanSound = (Button) findViewById(R.id.tucanSound);
        tucanSound.setOnClickListener(this);

        gaviotinSound = (Button) findViewById(R.id.gaviotinSound);
        gaviotinSound.setOnClickListener(this);

        paujilSound = (Button) findViewById(R.id.paujilSound);
        paujilSound.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(sound != null){
            sound.release();
        }
        int id = v.getId();
        switch (id){
            case R.id.cotingaSound:
                sound = MediaPlayer.create(this,R.raw.cotinga);
                break;
            case R.id.guacamayoSound:
                sound = MediaPlayer.create(this,R.raw.guacamayo);
                break;
            case R.id.tucanSound:
                sound = MediaPlayer.create(this,R.raw.tucan);
                break;
            case R.id.gaviotinSound:
                sound = MediaPlayer.create(this,R.raw.gaviotin);
                break;
            case R.id.paujilSound:
                sound = MediaPlayer.create(this,R.raw.paujil);
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