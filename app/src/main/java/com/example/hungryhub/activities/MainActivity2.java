package com.example.hungryhub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.hungryhub.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
    }

    public void register(View view){
        startActivity(new Intent(MainActivity2.this, RegistrationActivity.class));
    }

    public void login(View view) {
        startActivity(new Intent(MainActivity2.this, LoginActivity.class));

    }
}