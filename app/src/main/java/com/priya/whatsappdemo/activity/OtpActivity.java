package com.priya.whatsappdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.priya.whatsappdemo.R;

public class OtpActivity extends AppCompatActivity {
    public EditText otp;
    public TextView resend;
    public Button proceed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otp=findViewById(R.id.OtpEt);
        resend=findViewById(R.id.ResendTv);
        proceed=findViewById(R.id.ProceedBt);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(otp.length()<4){
                    Toast.makeText(OtpActivity.this,"Enter Valid OTP",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(OtpActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }




            }
        });
    }
}
