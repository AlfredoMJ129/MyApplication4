package com.example.amj.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pierna_al_horno extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pierna_al_horno);

    }

    public void principal(View view){

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);

    }

}
