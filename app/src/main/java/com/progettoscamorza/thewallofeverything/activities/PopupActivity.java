package com.progettoscamorza.thewallofeverything.activities;


import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.progettoscamorza.thewallofeverything.R;

public class PopupActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedinstanceState){
        super.onCreate(savedinstanceState);

        setContentView(R.layout.activity_pupup);

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));


    }

}

