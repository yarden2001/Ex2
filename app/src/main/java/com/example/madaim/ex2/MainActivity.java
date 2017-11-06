
package com.example.madaim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    final String MY_TAG = "Ex2.MainActivity";
    private int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, getString(R.string.create));
        if(savedInstanceState==null){
            Toast.makeText(this, getString(R.string.Toastintro), Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, getString(R.string.start));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, getString(R.string.Resume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, getString(R.string.pause));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(MY_TAG, getString(R.string.restore));
        if(savedInstanceState!=null){
            this.cnt=savedInstanceState.getInt("cnt", cnt);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(MY_TAG, getString(R.string.save));
        outState.putInt("cnt", this.cnt);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, getString(R.string.stop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, getString(R.string.destroy));
    }

    public void buttonClicked(View v) {
        EditText edName = (EditText) findViewById(R.id.etFirNam);
        if (edName.getText().length() == 0) {
            Toast.makeText(this, getString(R.string.Toastentername), Toast.LENGTH_LONG).show();
        } else {
            this.cnt++;
            Toast.makeText(this, getString(R.string.yarden) + cnt + getString(R.string.times), Toast.LENGTH_LONG).show();
        }
    }
}
