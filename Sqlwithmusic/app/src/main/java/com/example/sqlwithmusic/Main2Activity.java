package com.example.sqlwithmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import static com.example.sqlwithmusic.MainActivity.mediaPlayer;


public class Main2Activity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer.release();
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
}
