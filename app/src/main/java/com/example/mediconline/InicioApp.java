package com.example.mediconline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class InicioApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_app);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(InicioApp.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        //Se indica el tiempo que se debe esperar para que la accion termine y se pase al siguiente activity
        Timer tiempo = new Timer();
        tiempo.schedule(tarea,3000);
    }
}