package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.arch.persistence.room.Room;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.progettoscamorza.thewallofeverything.R;
import com.progettoscamorza.thewallofeverything.graphics.GameUI;
import com.progettoscamorza.thewallofeverything.persistence.DatabaseManager;

public class GameActivity extends Activity {

    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //database instance
        databaseManager = Room.databaseBuilder(
                getApplicationContext(), DatabaseManager.class, "WOE-DB").build();

        loadGraphic();
    }

    private void loadGraphic() {
        GLSurfaceView glSurfaceView = new GLSurfaceView(getApplicationContext());
        glSurfaceView.setRenderer(new GameUI());
    }
}
