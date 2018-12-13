package com.alkhensha.movieapp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.alkhensha.movieapp.R;
/**
 * Created by khenshaa on 12/14/17.
 */

public class SplashActivity extends AppCompatActivity {
    private Runnable mRunnable;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                nextToMainActivity();
            }
        };

        long SPLASH_TIME = 2000;
        mHandler.postDelayed(mRunnable, SPLASH_TIME);
    }

    private void nextToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mHandler.removeCallbacks(mRunnable);
    }

}
