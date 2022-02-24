package com.example.loadingscreen;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
/*
created by arshad.....
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DialogFragment loadingscreen = LoadingScreen.getInstance();
        findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadingscreen.show(getSupportFragmentManager(), "loading screen");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingscreen.dismiss();
                    }
                }, 3000);
            }
        });

    }
}