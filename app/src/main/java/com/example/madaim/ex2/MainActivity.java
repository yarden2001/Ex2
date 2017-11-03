package com.example.madaim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    final String MY_TAG = "Ex2.MainActivity";
    private int cnt =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "onCreateEvent");
        Toast.makeText(this,"Wellcome Yarden this is you first java coding expirince, KOL HAKVOD!!!!!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "onStartEvent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResumeEvent");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPauseEvent");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "onStopEvent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "onCreateEvent");
    }
    public void buttonClicked(View v){
        EditText edName = (EditText)findViewById(R.id.etFirNam);
        if(edName.getText().length()==0){
            Toast.makeText(this,"You must enter an name",Toast.LENGTH_LONG).show();
        }
        else{
            this.cnt++;
            Toast.makeText(this, "Yarden you clicked: "+cnt+" times", Toast.LENGTH_LONG).show();
        }
    }
}
