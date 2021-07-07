package com.alexis.ceja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //método del botón para iniciar sesion
    public void IniciarSesion(View view){
        Intent siguiente = new Intent(this, Iniciar_Sesion.class);
        startActivity(siguiente);
    }

    //metodo para crear una cuenta nueva
    public void CrearCuenta(View view){
        Intent crearCuenta = new Intent(this, registrate.class);
        startActivity(crearCuenta);
    }


}