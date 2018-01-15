package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.progettoscamorza.thewallofeverything.R;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button popup = (Button) findViewById(R.id.button12);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() ,NewQuestionProposalActivity.class);
                startActivity(intent);
            }
        });
    }

}
