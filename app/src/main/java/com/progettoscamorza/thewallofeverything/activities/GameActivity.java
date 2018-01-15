package com.progettoscamorza.thewallofeverything.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.progettoscamorza.thewallofeverything.R;
import com.progettoscamorza.thewallofeverything.persistence.DatabaseManager;
import com.progettoscamorza.thewallofeverything.services.UnityDataSender;
import com.scamorzaproject.topicmodeplay.UnityPlayerActivity;

import java.util.ArrayList;
import java.util.List;
//import com.scamorzaproject.topicmodeplay.UnityPlayerActivity;

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

        /* AVVIO DELL'ACTIVITY DI UNITY */
        //callInstanceCreator();
        startService(new Intent(this, UnityDataSender.class));
        //startActivity(new Intent(getApplicationContext(), UnityPlayerActivity.class));
    }

    public void callInstanceCreator() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1;Quanti minuti ci sono in un'ora?;60;30;45");
        stringList.add("2;Quanti giorni ci sono in una settimana?;7;8;6");
        stringList.add("3;La somma di un numero naturale n con il suo successivo n+1 è sempre un numero dispari?;V;F;Non ha senso");
        stringList.add("4;Quante sono le coppie di vertici opposti di un cubo?;4;6;10");
        //InstanceCreator.createQuestionPack(stringList);

    }
}
