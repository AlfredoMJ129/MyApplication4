package com.example.amj.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class salchichas_a_la_diabla extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salchichas_a_la_diabla);

    }

    public void principal(View view){

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);

    }
}
