package com.priya.whatsappdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.priya.whatsappdemo.R;

public class LoginActivity extends AppCompatActivity {

    public EditText mobile;
    public Button login;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int num = 20;
        if(num % 2 ==0)
            Toast.makeText(LoginActivity.this,"even",Toast.LENGTH_SHORT).show();
        if(num % 2!=0)
            Toast.makeText(LoginActivity.this,"odd",Toast.LENGTH_SHORT).show();


        int nums = 13;
        int i;
        int count = 1;
        for(i=2;i<=nums;++i)
        {
            if(nums%i==0){
                count++;

            }
        }
           if(count == 2) {
               Toast.makeText(LoginActivity.this, "prime", Toast.LENGTH_SHORT).show();

           }else {
                   Toast.makeText(LoginActivity.this,"composite",Toast.LENGTH_SHORT).show();
               }





        int a=10,b=30,c=40;
        if(a>b && a>c) {


                Toast.makeText(LoginActivity.this, "a", Toast.LENGTH_SHORT).show();
        }
        else if(b>c && b>a) {


                Toast.makeText(LoginActivity.this, "b", Toast.LENGTH_SHORT).show();
        }
        else if(c>a && c>b){

                Toast.makeText(LoginActivity.this,"c",Toast.LENGTH_SHORT).show();
        }
        int array[]={1,2,3,6,5};
        int flag=0;
        for(int k=0;i<array.length;++k){
            if(array[i]==6)
                flag=1;

        }
        if(flag==1) {
            Toast.makeText(LoginActivity.this, "found", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(LoginActivity.this,"not found",Toast.LENGTH_SHORT).show();
        }




        setContentView(R.layout.activity_login);

        mobile= findViewById(R.id.mobileEt);
        login=findViewById(R.id.LoginBt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mobile.length()<10){
                    Toast.makeText(LoginActivity.this,"Enter valid mobile no",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(LoginActivity.this,OtpActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
