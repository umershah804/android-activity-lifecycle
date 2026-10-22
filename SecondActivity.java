
package com.example.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {

    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "Second Activity: Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Second Activity: Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Second Activity: Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Second Activity: Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Second Activity: Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Second Activity: Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Second Activity: Destroyed");
    }
}
