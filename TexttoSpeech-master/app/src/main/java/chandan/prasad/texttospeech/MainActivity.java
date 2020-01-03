package chandan.prasad.texttospeech;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech ttsobject;
    int result;
    EditText et;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText1);



        ttsobject = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {

            @Override
            public void onInit(int status) {

                if (status == TextToSpeech.SUCCESS) {

                    result = ttsobject.setLanguage(Locale.UK);

                } else {

                    Toast.makeText(getApplicationContext(),
                            "Feature not Supported in Your Device",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    public void doSomething(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.bspeak:

                if(result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA){

                    Toast.makeText(getApplicationContext(),
                            "Feature not Supported in Your Device",
                            Toast.LENGTH_SHORT).show();

                }else{
                    text = et.getText().toString();

                    ttsobject.speak(text, TextToSpeech.QUEUE_FLUSH, null);

                }


                break;

            case R.id.bstopspeaking:

                if(ttsobject != null){

                    ttsobject.stop();


                }

                break;
        }


    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        if(ttsobject != null){

            ttsobject.stop();
            ttsobject.shutdown();

        }

    }

}
