package com.example.vas.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private final String TAG = "DEV";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onInfoLog(View view){
        Log.i(TAG, "Info level");
    }

    public void onWarmLog(View view){
        Log.v(TAG,"Warm level");
    }

    public void onErrorLog(View view){
        Log.e(TAG,"Error level");
    }

    public void onDebugLog(View view){
        Log.d(TAG,"Debug level");
        Log.v(TAG,"Verbose level");
        Log.wtf(TAG,"WTF level");
    }
}
