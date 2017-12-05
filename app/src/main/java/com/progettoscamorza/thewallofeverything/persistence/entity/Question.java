package com.progettoscamorza.thewallofeverything.persistence.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.progettoscamorza.thewallofeverything.enumerations.Complexity;
import com.progettoscamorza.thewallofeverything.enumerations.Topic;

@Entity(tableName = "QUESTIONS")
public class Question {

    @PrimaryKey
    private Integer id;

    @ColumnInfo(name = "TEXT")
    private String text;
    @ColumnInfo(name = "FIRST_ANSWER")
    private Answer answer1;
    @ColumnInfo(name = "SECOND_ANSWER")
    private Answer answer2;
    @ColumnInfo(name = "RIGHT_ANSWER")
    private Answer rightAnswer;
    @ColumnInfo(name = "TOPIC")
    private Topic topic;
    @ColumnInfo(name = "COMPLEXITY_LEVEL")
    private Complexity complexityLevel;

    public Question(String text, Answer answer1, Answer answer2, Answer rightAnswer, Topic topic, Complexity complexityLevel) {
        this.text = text;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.rightAnswer = rightAnswer;
        this.topic = topic;
        this.complexityLevel = complexityLevel;
    }

    public boolean isCorrect(Answer answer) {
        return answer.getText().equals(rightAnswer.getText());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Answer getAnswer1() {
        return answer1;
    }

    public void setAnswer1(Answer answer1) {
        this.answer1 = answer1;
    }

    public Answer getAnswer2() {
        return answer2;
    }

    public void setAnswer2(Answer answer2) {
        this.answer2 = answer2;
    }

    public Answer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Answer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Complexity getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(Complexity complexityLevel) {
        this.complexityLevel = complexityLevel;
    }
}
