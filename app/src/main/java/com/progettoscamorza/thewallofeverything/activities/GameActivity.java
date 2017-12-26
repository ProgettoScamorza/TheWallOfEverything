package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;

import com.progettoscamorza.thewallofeverything.R;
import com.progettoscamorza.thewallofeverything.persistence.DatabaseManager;

public class GameActivity extends Activity {

    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /*
        //database instance
        databaseManager = Room.databaseBuilder(
                getApplicationContext(), DatabaseManager.class, "WOE_DB").build();
            databaseManager.
        */

        /* AVVIO DELL'ACTIVITY DI UNITY*/
        //startActivity(new Intent(getApplicationContext(), UnityPlayerActivity.class));
    }
}
