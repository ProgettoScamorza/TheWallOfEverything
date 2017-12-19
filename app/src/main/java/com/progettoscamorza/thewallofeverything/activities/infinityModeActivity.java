package com.progettoscamorza.thewallofeverything.activities;

/**
 * Created by Enrico on 05/12/2017.
 */
import android.app.Activity;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;

import com.progettoscamorza.thewallofeverything.R;
import com.progettoscamorza.thewallofeverything.persistence.DatabaseManager;

public class infinityModeActivity extends Activity{
    private DatabaseManager databaseManager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinity);

        //database instance
        databaseManager = Room.databaseBuilder(
                getApplicationContext(), DatabaseManager.class, "WOE-DB").build();
    }



}
