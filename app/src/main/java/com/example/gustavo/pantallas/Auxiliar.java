package com.example.gustavo.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Auxiliar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxiliar);
    }

    public void ir_horario(View view){
        Intent i = new Intent (Auxiliar.this, Horarios.class);
        startActivity(i);


    }
}
