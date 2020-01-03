package com.example.sqlwithmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 static MediaPlayer mediaPlayer;
    Thread timer;




    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.backgroundmusic);
        mediaPlayer.start();

        timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(10000);


                }
                catch(InterruptedException e)
                {

                }
                finally
                {
                    Intent on = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(on);
                }
            }
        };
        timer.start();



    }

}

