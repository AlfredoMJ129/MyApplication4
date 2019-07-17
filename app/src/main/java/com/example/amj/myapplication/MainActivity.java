package com.example.amj.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void salchicas(View view){

        Intent i = new Intent(this, salchichas_a_la_diabla.class);

        startActivity(i);

    }

    public void rajas(View view){

        Intent i = new Intent(this, rajas_poblanas.class);

        startActivity(i);

    }

    public void asado(View view){

        Intent i = new Intent(this, asado_de_puerco.class);

        startActivity(i);

    }

    public void pierna_pina(View view){

        Intent i = new Intent(this, pierna_en_salsa_de_pina.class);

        startActivity(i);

    }

    public void pierna_horno(View view){

        Intent i = new Intent(this, pierna_al_horno.class);

        startActivity(i);

    }
}
