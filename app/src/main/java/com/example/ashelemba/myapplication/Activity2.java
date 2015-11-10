package com.example.ashelemba.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnBack = (Button) findViewById(R.id.btnBack);
    }

    public void toMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
