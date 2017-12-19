package com.progettoscamorza.thewallofeverything.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.progettoscamorza.thewallofeverything.enumerations.Complexity;
import com.progettoscamorza.thewallofeverything.enumerations.Topic;
import com.progettoscamorza.thewallofeverything.persistence.entity.Answer;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusFiftyFifty;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusPause;
import com.progettoscamorza.thewallofeverything.persistence.entity.BonusSlow;
import com.progettoscamorza.thewallofeverything.persistence.entity.Question;

/*@Database(entities = {
        BonusFiftyFifty.class,
        BonusPause.class,
        BonusSlow.class,
        Answer.class,
        Question.class,
        Complexity.class,
        Topic.class
}, version = 1)*/
public abstract class DatabaseManager extends RoomDatabase {
    //...

}
