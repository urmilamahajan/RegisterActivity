package com.example.interviewapplication;
import java.net.URI;


import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button bsimple, btough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Codes to add Action Bar

        LinearLayout front_ll =  findViewById(R.id.front_page_titlebar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.frontpage_title_bar);

        bsimple = findViewById(R.id.bsq);
        btough = findViewById(R.id.btq);

        bsimple.setOnClickListener(this);
        btough.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bsq:

                Intent i = new Intent(MainActivity.this, Simple_question.class);
                startActivity(i);

                break;
            case R.id.btq:

                Intent j = new Intent(MainActivity.this, Tough_question.class);
                startActivity(j);


                break;


        }

    }
}
