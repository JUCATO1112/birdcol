package com.example.birdcol;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOrinoquia extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    Button pescadoraSound, martinSound, pellaSound, cotuaSound, palomaSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orinoquia);

        pescadoraSound = (Button) findViewById(R.id.pescadoraSound);
        pescadoraSound.setOnClickListener(this);

        martinSound = (Button) findViewById(R.id.martinSound);
        martinSound.setOnClickListener(this);

        pellaSound = (Button) findViewById(R.id.pellarSound);
        pellaSound.setOnClickListener(this);

        cotuaSound = (Button) findViewById(R.id.cotuaSound);
        cotuaSound.setOnClickListener(this);

        palomaSound = (Button) findViewById(R.id.palomaSound);
        palomaSound.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(sound != null){
            sound.release();
        }
        int id = v.getId();
        switch (id){
            case R.id.pescadoraSound:
                sound = MediaPlayer.create(this,R.raw.aguila);
                break;
            case R.id.martinSound:
                sound = MediaPlayer.create(this,R.raw.martin_pescador);
                break;
            case R.id.pellarSound:
                sound = MediaPlayer.create(this,R.raw.pellar_playero);
                break;
            case R.id.cotuaSound:
                sound = MediaPlayer.create(this,R.raw.cotua);
                break;
            case R.id.palomaSound:
                sound = MediaPlayer.create(this,R.raw.paloma_morada);
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