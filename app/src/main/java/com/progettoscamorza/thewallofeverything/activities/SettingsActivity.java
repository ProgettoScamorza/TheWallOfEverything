package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;

import com.progettoscamorza.thewallofeverything.R;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Switch soundSwitch = (Switch)findViewById(R.id.switch1);
        String statusSwitch1;
        if (soundSwitch.isChecked())
            statusSwitch1 = soundSwitch.getTextOn().toString();
        else
            statusSwitch1 = soundSwitch.getTextOff().toString();

    }

}
