package com.example.gustavo.pantallas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class crear_materia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_materia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

        public void guardar (View view){
            Context context = getApplicationContext();
            CharSequence text = "Materia Guardada exitosamente";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            Intent i =new Intent(crear_materia.this, Horarios.class);
            startActivity(i);
        }
        public void salir (View view){
        Context context = getApplicationContext();
        CharSequence text = "No se ha registrado la materia";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent i =new Intent(crear_materia.this, Horarios.class);
        startActivity(i);
         }


}
