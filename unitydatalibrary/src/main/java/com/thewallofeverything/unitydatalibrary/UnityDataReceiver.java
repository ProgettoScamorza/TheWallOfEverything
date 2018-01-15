package com.thewallofeverything.unitydatalibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UnityDataReceiver extends BroadcastReceiver {

    private static UnityDataReceiver instance;

    public static String text = "";

    public UnityDataReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String sentIntent = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sentIntent != null) {
            text = sentIntent;
        }
    }

    public static void createInstance() {
        if(instance ==  null)
        {
            instance = new UnityDataReceiver();
        }
    }
}
