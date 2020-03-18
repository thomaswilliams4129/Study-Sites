package edu.floridapoly.studysites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    // After completion of 2000 ms, the next activity will get started.
    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //This method is used so that your splash activity
        //can cover the entire screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Intent is used to switch from one activity to another.
                Intent i =new Intent(MainActivity.this,
                        HomeScreen.class);

                //invoke the Second Activity.
                startActivity(i);

                //the current activity will get finished.
                finish();

            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
