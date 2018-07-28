package com.example.gustavo.pantallas;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.gustavo.pantallas.fragments.acerca_de;
import com.example.gustavo.pantallas.fragments.jueves;
import com.example.gustavo.pantallas.fragments.lunes;
import com.example.gustavo.pantallas.fragments.martes;
import com.example.gustavo.pantallas.fragments.miercoles;
import com.example.gustavo.pantallas.fragments.sabado;
import com.example.gustavo.pantallas.fragments.viernes;

public class Principal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, lunes.OnFragmentInteractionListener,
                                                                    martes.OnFragmentInteractionListener,
                                                                    miercoles.OnFragmentInteractionListener,
                                                                    jueves.OnFragmentInteractionListener,
                                                                    viernes.OnFragmentInteractionListener,
                                                                    sabado.OnFragmentInteractionListener,
                                                                    acerca_de.OnFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.





        int id = item.getItemId();
        if (id == R.id.nav_mapa) {
            Intent i = new Intent(this, Auxiliar.class);
            startActivity(i);


        } else if (id == R.id.nav_lunes) {
            lunes frg_lunes= new lunes();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_lunes);
            transaction.commit();

        } else if (id == R.id.nav_martes) {
            martes frg_martes= new martes();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_martes);
            transaction.commit();

        } else if (id == R.id.nav_miercoles) {
            miercoles frg_miercoles= new miercoles();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_miercoles);
            transaction.commit();


        } else if (id == R.id.nav_jueves) {
            jueves frg_jueves= new jueves();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_jueves);
            transaction.commit();

        } else if (id == R.id.nav_viernes) {
            viernes frg_viernes= new viernes();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_viernes);
            transaction.commit();

        } else if (id == R.id.nav_sabado) {
            sabado frg_sabado= new sabado();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_sabado);
            transaction.commit();

        } else if (id == R.id.nav_configuracion) {
            Intent i= new Intent(this, configuracion.class);
            startActivity(i);

        } else if (id == R.id.nav_about) {
            acerca_de frg_acerca= new acerca_de();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, frg_acerca);
            transaction.commit();

        } else if (id == R.id.nav_finseccion) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(Principal.this);
            alerta.setMessage("Desea Finalizar seccion?")
                    .setCancelable(false)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent in= new Intent(Principal.this, Login.class);
                            startActivity(in);
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog Titulo = alerta.create();
            Titulo.setTitle("Salir");
            Titulo.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
