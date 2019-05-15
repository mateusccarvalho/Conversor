package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startREALActivity (View view){
        Intent REALActivity = new Intent(this, REALActivity.class);
        startActivity(REALActivity);

    }

    public void startDOLARActivity (View view){
        Intent DOLARActivity = new Intent(this, DOLARActivity.class);
        startActivity(DOLARActivity);

    }

    public void startSOBREActivity (View view){
        Intent SOBREActivity = new Intent(this, SOBREActivity.class);
        startActivity(SOBREActivity);

    }

}
