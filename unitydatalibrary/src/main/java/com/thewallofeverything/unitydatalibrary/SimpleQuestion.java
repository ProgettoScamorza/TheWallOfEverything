package com.thewallofeverything.unitydatalibrary;

import java.util.Objects;

public class SimpleQuestion {

    private String text;
    private String rightAnswer;
    private String[] wrongAnswer;

    public SimpleQuestion() {
    }

    public SimpleQuestion(String text, String rightAnswer, String[] wrongAnswer) {
        this.text = text;
        this.rightAnswer = rightAnswer;
        this.wrongAnswer = wrongAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String[] getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(String[] wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public boolean isRight(String answer) {
        return answer.equals(rightAnswer);
    }
}
