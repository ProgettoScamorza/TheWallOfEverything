package com.progettoscamorza.thewallofeverything.activities;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.progettoscamorza.thewallofeverything.R;
import com.progettoscamorza.thewallofeverything.persistence.DatabaseManager;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //database instance
        DatabaseManager databaseManager = Room.databaseBuilder(
                getApplicationContext(), DatabaseManager.class, "WOE-DB").build();
    }
}
