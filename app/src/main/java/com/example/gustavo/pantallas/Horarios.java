package com.example.gustavo.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Horarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);
    }


    public void ir_agregar_materia (View view){
        Intent i = new Intent(this, crear_materia.class);
        startActivity(i);
    }
}
