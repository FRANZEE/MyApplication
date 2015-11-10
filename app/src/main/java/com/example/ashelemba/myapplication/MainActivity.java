package com.example.ashelemba.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnHelloWorld;
    Button btnGoodBye;
    Button btnToAnotherActivity;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHelloWorld = (Button) findViewById(R.id.btnHelloWorld);
        btnGoodBye = (Button) findViewById(R.id.btnGoodBye);
        btnToAnotherActivity = (Button) findViewById(R.id.btnToAnotherActivity);
        textView = (TextView) findViewById(R.id.textView);

    }

    public void sayHello (View view){
        textView.setText("Hello world!");
    }

    public void sayGoodBye (View view){
        textView.setText("Good Bye!");
    }

    public void toAnotherActivity (View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}