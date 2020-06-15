package com.example.praccalculadora;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServicioMusica extends Service {

    MediaPlayer reproductor;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        reproductor=MediaPlayer.create(getBaseContext() ,R.raw.audio);
    }

    @Override
    public  int onStartCommand(Intent intent, int flags,int startId){
        reproductor.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        reproductor.stop();
    }
}
