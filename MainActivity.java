
package com.example.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Main Activity: Created");

        Button button = findViewById(R.id.btnNext);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(
                    MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Main Activity: Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Main Activity: Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Main Activity: Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Main Activity: Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Main Activity: Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main Activity: Destroyed");
    }
}
