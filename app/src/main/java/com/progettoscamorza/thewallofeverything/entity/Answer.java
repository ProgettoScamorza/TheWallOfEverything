package com.progettoscamorza.thewallofeverything.entity;

public class Answer
{
    private String text;
    private boolean isDeletable;

    public Answer()
    {
    }

    public Answer(String text, boolean isDeletable)
    {
        this.text = text;
        this.isDeletable = isDeletable;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public boolean isDeletable()
    {
        return isDeletable;
    }

    public void setDeletable(boolean deletable)
    {
        isDeletable = deletable;
    }
}