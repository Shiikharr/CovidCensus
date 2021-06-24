package com.example.covidcensus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t1=new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
            }
        };
        t1.start();
    }
}