package com.progettoscamorza.thewallofeverything.enumerations;

import android.arch.persistence.room.Entity;

@Entity(tableName = "COMPLEXITY_LEVELS")
public enum Complexity {
    EASY,
    MEDIUM,
    HARD
}
