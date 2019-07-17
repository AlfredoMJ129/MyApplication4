package com.example.amj.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class asado_de_puerco extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asado_de_puerco);

    }

    public void principal(View view){

        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);

    }

}
