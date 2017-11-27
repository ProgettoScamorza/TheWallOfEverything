package com.progettoscamorza.thewallofeverything.enumerations;

import android.arch.persistence.room.Entity;

@Entity(tableName = "TOPICS")
public enum Topic {
    MATH,
    PHYSICS,
    HISTORY,
    COMPUTER_SCIENCE,
    ART
}
