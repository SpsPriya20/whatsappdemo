package com.priya.whatsappdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.priya.whatsappdemo.activity.LoginActivity;

public class WhatsappDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp_demo);

        getSupportActionBar().hide();
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(WhatsappDemoActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}
