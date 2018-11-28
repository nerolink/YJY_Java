package com.example.resource_library.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.resource_library.R;
import com.example.resource_library.constant.APPConstant;
import com.example.resource_library.util.SharedPreferencesUtil;

import java.util.Timer;
import java.util.TimerTask;


public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final String status = SharedPreferencesUtil.getString(getApplicationContext(), "STATUS");
        final String username = SharedPreferencesUtil.getString(getApplicationContext(), "USERNAME");
        System.out.println("stats===" + status);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (status.equals("LOGIN____")) {
                    APPConstant.TEACHERID = username;
                    APPConstant.LESSONID = APPConstant.TEACHERID + System.currentTimeMillis();
                    finish();
                } else {
                    finish();
                }
            }
        };
        timer.schedule(timerTask, 2000);
    }
}
