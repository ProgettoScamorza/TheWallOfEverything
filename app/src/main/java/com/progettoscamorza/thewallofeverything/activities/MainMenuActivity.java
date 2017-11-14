package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.progettoscamorza.thewallofeverything.R;

public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button topicsButton = (Button) findViewById(R.id.button3);
        topicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TopicsActivity.class);
                startActivity(intent);
            }
        });

        Button returnButton = (Button) findViewById(R.id.button11);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton settingsButton = (ImageButton) findViewById(R.id.imageButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SettingsActivity.class);
                startActivity(intent);
            }
        });

        Button storageButton = (Button) findViewById(R.id.button4);
        storageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),StorageActivity.class);
                startActivity(intent);
            }
        });
    }

}
