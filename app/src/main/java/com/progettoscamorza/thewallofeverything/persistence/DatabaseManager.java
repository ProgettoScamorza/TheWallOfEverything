package com.progettoscamorza.thewallofeverything.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.progettoscamorza.thewallofeverything.persistence.entity.Answer;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusFiftyFifty;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusPause;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusSlow;
import com.progettoscamorza.thewallofeverything.persistence.entity.Question;

@Database(entities = {
        BonusFiftyFifty.class,
        BonusPause.class,
        BonusSlow.class,
        Answer.class,
        Question.class
}, version = 0) // version da cambiare
public abstract class DatabaseManager extends RoomDatabase {
    //...

}
