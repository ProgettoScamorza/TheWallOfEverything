package com.progettoscamorza.thewallofeverything.services;


import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.widget.Toast;

import java.util.List;

public class UnityDataSender extends Service {

    private final Handler handler = new Handler();
    private int numIntent;
    private Runnable sendData = new Runnable() {
        @Override
        public void run() {
            String action = "com.progettoscamorza.thewallofeverything.services.IntentToUnity";

            numIntent++;
            Intent sendIntent = new Intent();
            sendIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION |
                            Intent.FLAG_FROM_BACKGROUND |
                            Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            sendIntent.setAction(action);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Intent "+numIntent);
            sendBroadcast(sendIntent);
            handler.removeCallbacks(this);
            handler.postDelayed(this, 5000);
        }
    };

    public UnityDataSender() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        numIntent = 0;
        handler.removeCallbacks(sendData);
        handler.postDelayed(sendData, 1000);
        return super.onStartCommand(intent, flags, startId);
    }
}
