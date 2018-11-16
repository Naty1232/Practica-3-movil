package com.example.usuario.practica3movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent;
        switch(item.getItemId()){
            case R.id.opcionLogin:
                intent=new Intent(MainActivity.this,ActividadLogin.class);
                startActivity(intent);
                break;

            case R.id.opcionRegistrar:
                intent=new Intent (MainActivity.this,ActividadRegistrar.class);
                startActivity(intent);
                break;


        }
        return true;
    } }

