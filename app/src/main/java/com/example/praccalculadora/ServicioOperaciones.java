package com.example.praccalculadora;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ServicioOperaciones extends Service {

    private Context ctx;
    MediaPlayer reproductor;

    public ServicioOperaciones(){
        super();
        this.ctx = this.getApplicationContext();
    }

    public ServicioOperaciones(Context c){
        super();
        this.ctx = c;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }


    public double realizarSuma(double a, double b){
        double result = a + b;
        return result;
    }

    public double realizarResta(double a, double b){
        double result = a - b;
        return result;
    }

    public double realizarMultiplicacion(double a, double b){
        double result = a * b;
        return result;
    }

    public double realizarDivision(double a, double b){
        double result = a / b;
        return result;
    }

}
