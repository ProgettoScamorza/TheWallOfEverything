package com.progettoscamorza.thewallofeverything.tools;

import com.progettoscamorza.thewallofeverything.persistence.entity.Question;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

public class NewQuestionProposal {

    private static final String scamorzaEmail = "question.scamorzaproject@gmail.com";
    private static final String senderMail = "sender.scamorzaproject@gmail.com";

    private Question question;
    private String senderPhoneName;
    private InetAddress senderIP;

    public NewQuestionProposal() {
    }

    public NewQuestionProposal(Question question, String senderPhoneName, InetAddress senderIP) {
        this.question = question;
        this.senderPhoneName = senderPhoneName;
        this.senderIP = senderIP;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getSenderPhoneName() {
        return senderPhoneName;
    }

    public void setSenderPhoneName(String senderPhoneName) {
        this.senderPhoneName = senderPhoneName;
    }

    public InetAddress getSenderIP() {
        return senderIP;
    }

    public void setSenderIP(InetAddress senderIP) {
        this.senderIP = senderIP;
    }

    public static void sendAMailToScamorza(NewQuestionProposal proposal) throws UnknownHostException {
        Properties properties = System.getProperties();
        properties.getProperty("mail.smtp.host", InetAddress.getLocalHost().toString());

        //Session session = get
    }
}
