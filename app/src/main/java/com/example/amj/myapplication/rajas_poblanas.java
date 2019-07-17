package com.example.amj.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class rajas_poblanas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajas_poblanas);

    }

    public void principal(View view){

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);

    }

}
