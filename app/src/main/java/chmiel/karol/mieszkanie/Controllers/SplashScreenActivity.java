package chmiel.karol.mieszkanie.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

import chmiel.karol.mieszkanie.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        int delay = 1000;
//        Timer timer = new Timer();
//        timer.schedule( new TimerTask(){
//            public void run() {
//            }
//        }, delay);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}