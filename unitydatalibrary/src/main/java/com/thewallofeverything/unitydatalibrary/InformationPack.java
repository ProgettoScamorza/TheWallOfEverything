package com.thewallofeverything.unitydatalibrary;

import com.thewallofeverything.unitydatalibrary.enumerations.Colors;

public class InformationPack {

    private String startString;
    private String askingString;
    private String winningString;
    private String losingString;
    private Colors popupColor;

    public InformationPack() {
    }

    public InformationPack(String startString, String askingString, String winningString,
            String losingString, Colors popupColor) {
        this.startString = startString;
        this.askingString = askingString;
        this.winningString = winningString;
        this.losingString = losingString;
        this.popupColor = popupColor;
    }

    public String getStartString() {
        return startString;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public String getAskingString() {
        return askingString;
    }

    public void setAskingString(String askingString) {
        this.askingString = askingString;
    }

    public String getWinningString() {
        return winningString;
    }

    public void setWinningString(String winningString) {
        this.winningString = winningString;
    }

    public String getLosingString() {
        return losingString;
    }

    public void setLosingString(String losingString) {
        this.losingString = losingString;
    }

    public Colors getPopupColor() {
        return popupColor;
    }

    public void setPopupColor(Colors popupColor) {
        this.popupColor = popupColor;
    }
}
