package com.alexis.ceja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginRed extends AppCompatActivity {

    Button btnCerrar, btnchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_red);
        btnCerrar=findViewById(R.id.btnCerrar);
        btnchat = findViewById(R.id.btncrearingrsarred);

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
                preferences.edit().clear().commit();

                Intent intent=new Intent(getApplicationContext(),Iniciar_Sesion.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void Iniciarchat(View view){
        Intent iniciarchat = new Intent(this, chatIngresar.class);
        startActivity(iniciarchat);
    }
}